package com.example.nest.model

import com.example.nest.R


data class Bird(val id: Int?, val typeBird: String?,  val name: String?, val name_latin: String?, val image: Int?) {

    companion object {
        fun getBird(): List<Bird> {

            return listOf(
                Bird(1, "Duck", "Mandarin Duck",null,  R.mipmap.mandarin_duck),
                Bird(2, "Duck", "Northern Pintall",null,  R.mipmap.northern_pintall),
                Bird(3, "Duck", "Wood Duck",null,  R.mipmap.wood_duck),
                Bird(4, "Duck", "American Wigeon",null,  R.mipmap.american_wigeon),
                Bird(5, "Goose", "Mandarin Duck",null,  R.mipmap.mandarin_duck),
                Bird(6, "Goose", "Mandarin Duck",null,  R.mipmap.mandarin_duck),
                Bird(7, "Goose", "Mandarin Duck",null,  R.mipmap.mandarin_duck),

            )

        }

    }


}