package com.evilfloof.dailyinsult

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.evilfloof.dailyinsult.adapter.ItemAdapter
import com.evilfloof.dailyinsult.data.Datasource

/*
* This app loads an insult and puts it in a RecyclerView on screen
* Together with a floof emote :Prayge:
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // datasource and the main view itself
        val weDoALittleTrolling = Datasource().loadInsults()
        val viewWashingMachine = findViewById<RecyclerView>(R.id.recycler_view)

        // see: RecyclerView.ItemAdapter
        viewWashingMachine.adapter = ItemAdapter(this, weDoALittleTrolling)
        viewWashingMachine.setHasFixedSize(true)
    }
}