package com.chirikualii.pertemuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chirikualii.pertemuan3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding

    var resultA = ""
    var resultB = ""
    var teamA = ""
    var teamB = ""
    var scoreA = ""
    var scoreB = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        resultA = intent.getStringExtra("timA") ?: "defult value"
        binding.tvResultA.text = resultA

        resultB = intent.getStringExtra("timB") ?: "defult value"
        binding.tvResultB.text = resultB


        /**
         * TODO
          tampilkan data dari activity match seperti pada layout [activity_result.XML]
         **/


    }
}