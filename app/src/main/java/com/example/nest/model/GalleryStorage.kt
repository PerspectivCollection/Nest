package com.example.nest.model

import com.example.nest.R

data class GalleryStorage(val id: Int, var image: Int) {
    companion object {
        fun getGalery(): List<GalleryStorage> {

            return listOf(
                GalleryStorage(1, R.mipmap.mandarin_duck),
                GalleryStorage(2, R.mipmap.northern_pintall),
                GalleryStorage(3, R.mipmap.wood_duck),
                GalleryStorage(4, R.mipmap.american_wigeon),
//                Bird(5, "Goose", "Mandarin Duck",null,  R.mipmap.mandarin_duck),
//                Bird(6, "Goose", "Mandarin Duck",null,  R.mipmap.mandarin_duck),
//                Bird(7, "Goose", "Mandarin Duck",null,  R.mipmap.mandarin_duck),

            )

        }
    }


}