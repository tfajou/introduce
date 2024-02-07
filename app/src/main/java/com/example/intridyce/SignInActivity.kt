package com.example.intridyce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.intridyce.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySignInBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val btn_signin = binding.btnSignIn
        val btn_signup = binding.btnSignUp

        btn_signin.setOnClickListener {
            val id = binding.edId.text.toString()
            val passwrod = binding.edPassword.text.toString()

            if (id.isEmpty() || passwrod.isEmpty()) {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("dataFromSignInActivity", id)
                intent.putExtra("dataFromSignInActivity", passwrod)
                startActivity(intent)
            }
        }

        btn_signup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}