package com.prabhat.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
//import android.renderscript.ScriptGroup
import android.widget.TextView
import android.widget.Toast
import com.prabhat.helloworld.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   // private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        //binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        //setContentView(binding.root)
        //val mytext=findViewById<TextView>(R.id.textView)
        //textView.text="don"
        //binding.textView.text="Raja"
       // get reference to button
       //val btn_click_me = findViewById(R.id.button) as Button
       //var mytextView = findViewById(R.id.textView) as TextView
       var timeClicked=0
// set on-click listener
       button.setOnClickListener {
           //mytextView.text=timeClicked.toString()
           ///mytextView.text= (timeClicked+1).toString()
           //timeClicked=timeClicked+1
           timeClicked+=1
           textView.text=timeClicked.toString()
           Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
       }

    }
}