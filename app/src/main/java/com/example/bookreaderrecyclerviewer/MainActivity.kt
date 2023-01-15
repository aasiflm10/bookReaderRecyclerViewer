package com.example.bookreaderrecyclerviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Books>

    lateinit var imageId : Array<Int>
    lateinit var title : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId = arrayOf(
                R.drawable.b,
                R.drawable.deadthly_hallows,
                R.drawable.harry_potter,
                R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g
        )

        title = arrayOf(
            "Harry Potter and the prisoner of azkaban",
            "Harry Potter and the philosopher's stone",
            "Some other book name",
            "bnjfvdsjne jngdjkv jnjdvj",
            "sdsfsefgpnjgpieng jpngdjne",
            "gangjsdfpgjn uwfjadgjnf",
            "sgnojgeifpjndsf ujngduipjdfj",
            "gnjgegjefjn uinjgejn uijngfjep"

            )

        newRecyclerView = findViewById(R.id.recyclerViewer)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Books>()
        getUserdata()


    }

    private fun getUserdata() {
        for( i in imageId.indices)
        {
            val books = Books(imageId[i], title[i])
            newArrayList.add(books)

        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }




}