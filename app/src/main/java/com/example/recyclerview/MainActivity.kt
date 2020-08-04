package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNames.layoutManager=LinearLayoutManager(baseContext)
        data class Person(var name:String,var age:Int,var dob:String,var hobby:String)
        val namesAdapter=
            NamesRecyclerViewAdapter(namesList = listOf(
                    name("Andrew", 13,"14/04/2007","football"),
                    name("Pauline",23,"23/09/1997","playing hockey"),
                    name("Sue",10,"12/12/2010","travelling"),
                    name("Manuel", 14,"5/07/2006","swimming"),
                    name("Sharon",16, "27/04/2004","Playing basketball"),
                    name("Lurther",56,"30/03/1964","reading novels"),
                    name("Kagwe", 42, "9/07/1978","playing tennis"),
                    name("Prudence",18,"1/1/20002","cooking"),
                    name("Rayleen",6,"20/11/2014","dancing"),
                    name("Maggy",62,"13/03/1958","Singing")
                )
                        tvName.adapter=namesAdapter
    }

    private fun name(s: String, i: Int, s1: String, s2: String) {

    }
}

private infix fun Any.name(s: String) = Unit
