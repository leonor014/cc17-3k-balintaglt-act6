package com.example.a30daysapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FitnessTipAdapter
    private val tips = listOf(
        FitnessTip("Drink Water Every Morning", "Day 1","Start your day with hydration!", R.drawable.water),
        FitnessTip("30-Minute Daily Walk", "Day 2", "Walking is a great way to stay fit.", R.drawable.walking),
        // Add your FitnessTip objects here
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = FitnessTipAdapter(tips)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}

data class FitnessTip(
    val title: String,
    val day: String,
    val description: String,
    val imageResId: Int
)

class FitnessTipAdapter(private val tips: List<com.example.a30daysapp.FitnessTip>) :
    RecyclerView.Adapter<FitnessTipAdapter.TipViewHolder>() {

    class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.tipTitle)
        val dayTextView: TextView = itemView.findViewById(R.id.tipDay)
        val description: TextView = itemView.findViewById(R.id.tipDescription)
        val image: ImageView = itemView.findViewById(R.id.tipImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fitness_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]
        holder.titleTextView.text = tip.title
        holder.dayTextView.text = tip.day
        holder.description.text = tip.description
        holder.image.setImageResource(tip.imageResId)

        val dayColor = when (position % 30 + 1) { // To cycle through 1-30
            1 -> R.color.day1
            2 -> R.color.day2
            else -> R.color.day1 // Default
        }
        val colorInt = ContextCompat.getColor(holder.itemView.context, dayColor)
        holder.itemView.setBackgroundColor(colorInt)
    }



        // Set the background color based on the position




    override fun getItemCount() = tips.size

    data class FitnessTip(
        val title: String,
        val day: String,
        val description: String,
        val imageResId: Int
    )

}
