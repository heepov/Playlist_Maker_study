package com.example.playlistmaker.data

import com.google.gson.annotations.SerializedName

data class Track (
    val trackId: Int,
    val trackName: String,
    val artistName: String,
    val trackTimeMillis: Long,
    @SerializedName("artworkUrl100") val coverUrl: String,
)