package edu.temple.baseassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val images = arrayOf(
            ImageItem(R.drawable.adam_peaty, "Adam Peaty"),
            ImageItem(R.drawable.anna_hall, "Anna Hall"),
            ImageItem(R.drawable.alex_walsh, "Alex Walsh"),
            ImageItem(R.drawable.anna_cockrell, "Anna Cockrell"),
            ImageItem(R.drawable.anna_henderson,"Anna Henderson"),
            ImageItem(R.drawable.courtney_frerichs, "Courtney Frerichs"),
            ImageItem(R.drawable.danis_civil,"Danis Civil"),
            ImageItem(R.drawable.julien_alfred,"Julien Alfred"),
            ImageItem(R.drawable.mykayla_skinner,"Mykayla Skinner"),
            ImageItem(R.drawable.perris_benegas,"Perris Benegas"),
            ImageItem(R.drawable.prisca_awiti,"Prisca Awiti"),
            ImageItem(R.drawable.sagen_maddalena,"Sagen Maddalena"),
            ImageItem(R.drawable.simone_biles,"Simone Biles"),
            ImageItem(R.drawable.spencer_lee,"Spencer Lee"),
            ImageItem(R.drawable.yusuf_dikec,"Yusuf Dikec")
        )

        recyclerView.adapter = ImageAdapter(images)

        recyclerView.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
    }
}