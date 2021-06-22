package br.com.liebersonsantos.movieappnetflix.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by lieberson on 6/6/21.
 * @author lieberson.xsantos@gmail.com
 */
@Parcelize
data class Category (
        val name: String?,
        var movies: MutableList<Movie>?
): Parcelable