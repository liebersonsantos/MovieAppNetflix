package br.com.liebersonsantos.movieappnetflix.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.liebersonsantos.movieappnetflix.R
import br.com.liebersonsantos.movieappnetflix.databinding.ActivityMainBinding
import br.com.liebersonsantos.movieappnetflix.model.Category
import br.com.liebersonsantos.movieappnetflix.model.Movie
import br.com.liebersonsantos.movieappnetflix.view.adapter.CategoryAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = _binding.root
        setContentView(view)

        val categories = mutableListOf<Category>()
        for (j in 1..10) {
            val category = Category(name = "cat $j", null)

            val movies = mutableListOf<Movie>()
            for (i in 1..10) {
                val movie = Movie(null)
                movies.add(movie)
            }

            category.movies = movies
            categories.add(category)

        }

        with(_binding.recyclerViewMain){
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = CategoryAdapter(categories, this@MainActivity)
        }
        
    }
}
