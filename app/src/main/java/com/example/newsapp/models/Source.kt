package com.example.newsapp.models

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize

@Parcelize
data class Source(
    val id: String,
    val name: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    companion object : Parceler<Source> {

        override fun Source.write(parcel: Parcel, flags: Int) {
            parcel.writeString(id)
            parcel.writeString(name)
        }

        override fun create(parcel: Parcel): Source {
            return Source(parcel)
        }
    }
}
