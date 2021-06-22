package br.com.liebersonsantos.movieappnetflix.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val coverUrl: Int?
): Parcelable