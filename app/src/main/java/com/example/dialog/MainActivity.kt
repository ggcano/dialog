package com.example.dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var dialogFragment = CustomDialogFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.texviewmain.setOnClickListener {

            dialogFragment.show(supportFragmentManager, "customDialog")


        }
    }
}