package com.bhaskardamayanthi.resoluteassientment.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bhaskardamayanthi.gossy.localStore.StoreManager
import com.bhaskardamayanthi.resoluteassientment.R
import com.bhaskardamayanthi.resoluteassientment.databinding.ActivityLoginAuthenticationBinding

class LoginAuthenticationActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginAuthenticationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginAuthenticationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.upload.setOnClickListener {
            if (binding.numberEt.text.toString().isNotEmpty()){
                val intent  =  Intent(this,OTPActivity::class.java)
                intent.putExtra("number",binding.numberEt.text.toString())
                startActivity(intent)
            }
        }
        binding.back.setOnClickListener {



        }
    }
    }
