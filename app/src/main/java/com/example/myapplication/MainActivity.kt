package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView :  TextView = findViewById(R.id.textView)
        val aaa :  ConstraintLayout = findViewById(R.id.aaa)
        when (item.itemId){
            R.id.action1 -> {
                textView.text = "Вы выбрали пункт 1"
                aaa.setBackgroundColor(ContextCompat.getColor(applicationContext,
                    R.color.yellow))
                return true

            }
            R.id.action2 -> {
                textView.text = "Вы выбрали пункт 2"
                aaa.setBackgroundColor(ContextCompat.getColor(applicationContext,
                    R.color.green))
                return true
            }
            R.id.action3 -> {
                textView.text = "Вы выбрали пункт 3"
                aaa.setBackgroundColor(ContextCompat.getColor(applicationContext,
                    R.color.red))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}