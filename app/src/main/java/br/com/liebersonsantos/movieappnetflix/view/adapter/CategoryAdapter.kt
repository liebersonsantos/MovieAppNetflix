package br.com.liebersonsantos.movieappnetflix.view.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.liebersonsantos.movieappnetflix.R
import br.com.liebersonsantos.movieappnetflix.model.Category
import kotlinx.android.synthetic.main.category_item.view.*

/**
 * Created by lieberson on 6/9/21.
 * @author lieberson.xsantos@gmail.com
 */
class CategoryAdapter(private val categories: MutableList<Category>,
                      private val activity: Activity): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categories[position], activity)
    }

    override fun getItemCount() = categories.count()

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title = itemView.txtTitle
        private val recyclerView = itemView.recyclerViewMovie

        fun bind(category: Category, activity: Activity){
            title.text = category.name
            with(recyclerView){
                layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
                adapter = MovieAdapter(category.movies!!)
            }
        }

    }
}