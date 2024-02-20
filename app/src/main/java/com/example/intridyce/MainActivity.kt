package com.example.intridyce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intridyce.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private lateinit var cameraFragment: CameraFragment
    private lateinit var searchFragment: SearchFragment
    private lateinit var homeFragment: HomeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomnaviMain.setOnNavigationItemSelectedListener(onBottomNavItemSelectedListener)


        homeFragment = HomeFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, homeFragment)
            .commit()

        val id = intent.getStringExtra("dataFromSignInActivity")

        binding.imgMain.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
        binding.imgMypage.setOnClickListener {
            val intent = Intent(this, MypageActivity::class.java)
            startActivity(intent)
        }

    }

    private val onBottomNavItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item_camera -> {
                    cameraFragment = CameraFragment.newInstance()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, cameraFragment!!).commit()
                    true
                }
                R.id.item_search -> {
                }
                // Add cases for other menu items if needed
                else -> false
            }
            true
        }
}


//    override fun onNavigationItemSelected(item:MenuItem):Boolean{
//
//
//    }
//    private fun replaceFragment(fragment: Fragment) {
//        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.bottomnavi_main,fragment)
//        fragmentTransaction.commit()
//    }
//
//    private fun navigationItemSelect(){
//        binding.bottomnaviMain.run {
//            setOnItemSelectedListener { item ->
//                when(item.itemId){
//                    R.id.item_camera -> replaceFragment(CameraFragment())
//                }
//                true
//            }
//            selectedItemId=R.id.item_home
//        }
//
//
//    }


