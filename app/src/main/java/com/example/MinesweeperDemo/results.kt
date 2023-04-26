package com.example.MinesweeperDemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_results.*

class results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        var intent = getIntent()
        var showResult = intent.getStringExtra("result")

        val actionbar = supportActionBar
        actionbar!!.title = "Game Score"

        show_result.text=showResult

        home.setOnClickListener {
            Toast.makeText(this,"Thank You For Playing", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, MainActivity::class.java).apply{

            }
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finishAffinity()
    }

}