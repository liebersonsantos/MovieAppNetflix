package br.com.liebersonsantos.movieappnetflix.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.liebersonsantos.movieappnetflix.R
import br.com.liebersonsantos.movieappnetflix.model.Category
import br.com.liebersonsantos.movieappnetflix.model.Movie
import kotlinx.android.synthetic.main.category_item.view.*
import kotlinx.android.synthetic.main.movie_item.view.*

/**
 * Created by lieberson on 6/9/21.
 * @author lieberson.xsantos@gmail.com
 */
class MovieAdapter(private val movies: MutableList<Movie>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount() = movies.count()

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image = itemView.imgMovie

        fun bind(movie: Movie){
//            image.setImageResource(movie.coverUrl)
        }

    }
}