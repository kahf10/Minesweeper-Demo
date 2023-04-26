package com.example.MinesweeperDemo

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var level = ""
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title = "Welcome"

        level="easy"
        sharedPreferences = this.getSharedPreferences("time", Context.MODE_PRIVATE)
        val ltime: String? =sharedPreferences.getString("Last","00:00")

        lastGameTime.text= ltime

            start.setOnClickListener {

                if(level==""){
                    Toast.makeText(this, "Choose Valid Option", Toast.LENGTH_SHORT).show()
                } else {
                    val intent = Intent(this, GamePlay::class.java).apply {
                        putExtra("selectedLevel", level)
                        putExtra("flag", 1)
                    }
                    startActivity(intent)
                }
            }

    }
    override fun onBackPressed() {
        finishAffinity()
    }


}