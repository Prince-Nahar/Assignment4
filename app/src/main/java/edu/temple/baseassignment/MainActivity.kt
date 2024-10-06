package edu.temple.baseassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val images = arrayOf(
            R.drawable.adam_peaty,
            R.drawable.anna_hall,
            R.drawable.alex_walsh,
            R.drawable.anna_cockrell,
            R.drawable.anna_henderson,
            R.drawable.courtney_frerichs,
            R.drawable.danis_civil,
            R.drawable.julien_alfred,
            R.drawable.mykayla_skinner,
            R.drawable.perris_benegas,
            R.drawable.prisca_awiti,
            R.drawable.sagen_maddalena,
            R.drawable.simone_biles,
            R.drawable.spencer_lee,
            R.drawable.yusuf_dikec
        )

    }
}