package com.tomoe.bts_lecture

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭 되었다는 것을 알아야 한다! (프로그램이)
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener {

            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭 되면 다음 화면으로 넘어가서, 사진을 크게 보여줌!
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

    }
}