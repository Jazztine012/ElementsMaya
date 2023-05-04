package com.example.kotlinappresources

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.example.kotlinappresources.databinding.ActivityPrimaryBinding
import com.example.kotlinappresources.databinding.ActivityVouchersBinding

class VouchersActivity : AppCompatActivity(), OnClickListener {

    private lateinit var binding: ActivityVouchersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVouchersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonBackButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.imageButton_backButton -> {
                finish()
            }
        }
    }
}