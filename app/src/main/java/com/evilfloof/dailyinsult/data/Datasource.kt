package com.evilfloof.dailyinsult.data

import com.evilfloof.dailyinsult.R
import com.evilfloof.dailyinsult.model.Insult

class Datasource {
    fun loadInsults(): List<Insult> {
        return listOf<Insult>(
            Insult(R.string.insult1, R.drawable.floof1),
            Insult(R.string.insult2, R.drawable.floof2),
            Insult(R.string.insult3, R.drawable.floof3),
            Insult(R.string.insult4, R.drawable.floof4),
            Insult(R.string.insult5, R.drawable.floof5),
            Insult(R.string.insult6, R.drawable.floof6),
            Insult(R.string.insult7, R.drawable.floof7),
            Insult(R.string.insult8, R.drawable.floof8),
            Insult(R.string.insult9, R.drawable.floof9),
            Insult(R.string.insult10, R.drawable.floof10)
        )
    }
}