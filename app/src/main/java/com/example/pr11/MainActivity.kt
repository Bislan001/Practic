package com.example.pr11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button(view: View) {
        val photo: ImageView = findViewById(R.id.imageView4);
        val image: Int = R.drawable.img2;
        photo.setImageResource(image);


    }
var status = true
    fun btnClick2(view: View) {
        val imgBtn: ImageButton = findViewById(R.id.button_image)
        if (status == true){
            imgBtn.setImageResource(R.drawable.img2)
            status = false
        }
        else {
            imgBtn.setImageResource(R.drawable.img1)
            status = true
        }

    }


}