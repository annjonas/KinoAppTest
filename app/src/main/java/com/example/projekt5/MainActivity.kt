package com.example.projekt5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projekt5.databinding.ActivityMainBinding
import com.example.projekt5.ui.ImagesAdapter

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Powiązanie widoku z binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Ustawienie layoutu przez binding

        // Lista obrazków (drawable)
        val imageList = listOf(
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img
        )

        // Inicjalizacja RecyclerView
        binding.recyclerViewImages.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewImages.adapter = ImagesAdapter(imageList)
    }
}
