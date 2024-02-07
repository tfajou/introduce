 package com.example.intridyce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.intridyce.databinding.ActivitySignUpBinding

 class SignUpActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySignUpBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val btn_signup = binding.btnSignUp

        btn_signup.setOnClickListener {
            val id = binding.edIdUp.text.toString()
            val passwrod = binding.edPasswordUp.text.toString()
            val name = binding.edNameUp.text.toString()

            if (id.isEmpty() || passwrod.isEmpty()|| name.isEmpty()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}