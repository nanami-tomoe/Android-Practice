package com.tomoe.twice

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        // 데이터 받기
        val getData = intent.getStringExtra("data")

        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        // Toast.makeText(this, getData, Toast.LENGTH_SHORT).show()

        if(getData == "1") {
            // 이미지 변경
            memberImage.setImageResource(R.drawable.member_1)
        }

        if(getData == "2") {
            memberImage.setImageResource(R.drawable.member_2)
        }

        if(getData == "3") {
            memberImage.setImageResource(R.drawable.member_3)
        }

        if(getData == "4") {
            memberImage.setImageResource(R.drawable.member_4)
        }

        if(getData == "5") {
            memberImage.setImageResource(R.drawable.member_5)
        }

        if(getData == "6") {
            memberImage.setImageResource(R.drawable.member_6)
        }

        if(getData == "7") {
            memberImage.setImageResource(R.drawable.member_7)
        }

        if(getData == "8") {
            memberImage.setImageResource(R.drawable.member_8)
        }

        if(getData == "9") {
            memberImage.setImageResource(R.drawable.member_9)
        }

    }
}