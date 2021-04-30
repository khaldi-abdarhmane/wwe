package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class pers
{
   lateinit var nom:String
   lateinit var desti:String



}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageView=findViewById<ImageView>(R.id.x_imageView)
        var textView=findViewById<TextView>(R.id.x3_textView)
        var textView2=findViewById<TextView>(R.id.x4_textView)

       var a:Int=(1..5).random()

        var tab_name= getResources().getStringArray(R.array.tab_name)
        var tab_destr= getResources().getStringArray(R.array.tab_destr)

        val numbers = IntArray(5)

        textView.text=  tab_name[a]
        textView2.text=tab_destr[a]+tab_destr[a]
        var img:Int =R.drawable.businessman


        var imageres= IntArray(10)
              //   imageres[1]=
                        // var aa =R.drawable.businessman
        imageres[1]=R.drawable.businessman
        imageres[3]=R.drawable.businessman
        imageres[5]=R.drawable.businessman
        imageres[7]=R.drawable.businessman
        imageres[2]=R.drawable.iconfinder_people_2639885
        imageres[4]=R.drawable.iconfinder_people_2639885
        imageres[6]=R.drawable.iconfinder_people_2639885
        imageres[8]=R.drawable.iconfinder_people_2639885








        imageView.setImageResource(imageres[a])




    }
}