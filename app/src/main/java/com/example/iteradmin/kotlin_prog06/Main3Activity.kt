package com.example.iteradmin.kotlin_prog06

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val  img=findViewById<ImageView>(R.id.image)
        val btn=findViewById<Button>(R.id.button)
        val im= arrayOf("https://m.media-amazon.com/images/M/MV5BMTA2NTg0ODA1ODJeQTJeQWpwZ15BbWU4MDM0NDkxNTMy._V1_UY209_CR4,0,140,209_AL_.jpg",
        "https://m.media-amazon.com/images/M/MV5BMTczMzY3Nzk5MV5BMl5BanBnXkFtZTgwMjIyMDU0OTE@._V1_UX140_CR0,0,140,209_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTM2Mzc1MDYxOV5BMl5BanBnXkFtZTcwMzc1MDQ4Nw@@._V1_UY209_CR9,0,140,209_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjM0OTc5OTAwMl5BMl5BanBnXkFtZTgwMzA5NTU3MDI@._V1_UY209_CR81,0,140,209_AL_.jpg"
        )
       Glide.with(this).load(im[0]).into(image)
        val n:Int = im.size
        var i:Int=0

        btn.setOnClickListener(){
           Glide.with(this).load(im[i%n]).into(image)
            i++
        }
    }
}
