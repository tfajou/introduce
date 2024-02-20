package com.example.intridyce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.intridyce.databinding.ActivityDetailBinding
import com.example.intridyce.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private val binding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
    private val dataList = mutableListOf<ItemData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        dataList.add(ItemData(R.drawable.sample1, "김00",50000, "장인",1000, 30, false))
        dataList.add(ItemData(R.drawable.hand, "김00", 10000,"갓헨드", 20000, 20,  false))
        dataList.add(ItemData(R.drawable.sample1, "김00", 30000,"코코유", 10000, 30, false))
        dataList.add(ItemData(R.drawable.hand, "김00", 20000,"Nicole", 10000, 7,  false))
        dataList.add(ItemData(R.drawable.sample1, "김00",  50000,"수형", 150000, 11,  false))
        dataList.add(ItemData(R.drawable.download, "김00", 5000,"미니멀하게", 50000, 11,  false))
        dataList.add(ItemData(R.drawable.sample1, "김00", 70000,"굿리치", 100, 47,  false))
        dataList.add(ItemData(R.drawable.sample1, "김00",80000, "헤이",180000, 74,  false))
        dataList.add(ItemData(R.drawable.sample1, "김00",90000, "알뜰한",30000, 123,  false))
        dataList.add(ItemData(R.drawable.sample1, "김00",100000, "똑태현",190000, 147,false))

        val adapter = MyAdapter(dataList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        adapter.itemClick = object :MyAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
            }
        }
    }
}