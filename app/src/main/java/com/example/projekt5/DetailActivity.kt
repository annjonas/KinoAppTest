import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projekt5.R
import com.example.projekt5.databinding.ActivityDetailBinding
import com.example.projekt5.ui.ImagesAdapter

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImagesAdapter
    private val imageList = listOf(
        R.drawable.img, // Zmieniamy img1, img2 itd. na rzeczywiste obrazki
        R.drawable.img,
        R.drawable.img,
        R.drawable.img,
        R.drawable.img,
        R.drawable.img,
        R.drawable.img
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.recyclerViewImages)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ImagesAdapter(imageList)
        recyclerView.adapter = adapter
    }
}
