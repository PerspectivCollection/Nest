package com.example.nest.model

import com.example.nest.R


//data class Bird(val id: Int?, val typeBird: String?,  val name: String?, val name_latin: String?, val image: Int?) {
data class Bird(val id: Int, var typeBird: String?,  var name: String?, var name_latin: String?, var image: Int?, var audio: Int?) {

    companion object {
        fun getBird(): List<Bird> {

            return listOf(
                Bird(1, "Duck", "Mandarin Duck",null,  R.mipmap.mandarin_duck, R.raw.mandarian_duck),
                Bird(2, "Duck", "Northern Pintall",null,  R.mipmap.northern_pintall, R.raw.northern_pintail),
                Bird(3, "Duck", "Wood Duck",null,  R.mipmap.wood_duck, R.raw.wood_duck),
                Bird(4, "Duck", "American Wigeon",null,  R.mipmap.american_wigeon, R.raw.american_wigeon),
                Bird(6, "Duck", "american black duck",null,  R.mipmap.american_black_duck, R.raw.american_black_duck),
                Bird(7, "Duck", "baikal teal",null,  R.mipmap.baikal_teal, R.raw.baikal_teal ),
                Bird(8, "Duck", "barrow goldeneye",null,  R.mipmap.barrow_goldeneye, R.raw.barrow_goldeneye),
                Bird(9, "Duck", "blackellied whistling","fant ingen b",  R.mipmap.blackellied_whistling, R.raw.blackelliedwhistling),
                Bird(10, "Duck", "blue winged teal","fant ingen b",  R.mipmap.blue_winged_teal, R.raw.blue_winged_teal),
                Bird(11, "Duck", "brazilian teal","fant ingen b",  R.mipmap.brazilian_teal, R.raw.brazilian_teal),
                Bird(12, "Duck", "bufflehead",null,  R.mipmap.bufflehead, R.raw.bufflehead),
                Bird(13, "Duck", "cinnamon teal",null,  R.mipmap.cinnamon_treal, R.raw.cinnamon_teal),
                Bird(14, "Duck", "common goldeneye",null,  R.mipmap.common_goldeneye, R.raw.common_goldeneye),
                Bird(15, "Duck", "common pochard",null,  R.mipmap.common_pochard, R.raw.common_pochard),
                Bird(16, "Duck", "common scoter",null,  R.mipmap.common_scoter, R.raw.common_scoter),
                Bird(17, "Duck", "common shelduck",null,  R.mipmap.common_shelduck, R.raw.common_shelduck),
                Bird(18, "Duck", "eurasian teal",null,  R.mipmap.eurasian_teal, R.raw.eurasian_teal),
                Bird(19, "Duck", "eurasian wigeon",null,  R.mipmap.eurasian_wigeon, R.raw.eurasian_wigeon),
                Bird(20, "Duck", "ferruginous duck",null,  R.mipmap.ferruginous_duck, R.raw.ferruginous_duck),
                Bird(21, "Duck", "fulvous whisling duck",null,  R.mipmap.fulvous_whisling_duck, R.raw.fulvous_whisling_duck),
                Bird(22, "Duck", "king eider",null,  R.mipmap.king_eider, R.raw.king_eider),
                Bird(23, "Duck", "gadwall",null,  R.mipmap.gadwall, R.raw.gadwall),
                Bird(24, "Duck", "garganey",null,  R.mipmap.garganey, R.raw.garganey),
                Bird(25, "Duck", "greater scaup",null,  R.mipmap.greater_scaup, R.raw.greaterscaup),
                Bird(26, "Duck", "green winged teal",null,  R.mipmap.green_winged_teal, R.raw.green_winged_teal),
                Bird(27, "Duck", "hooded merganser",null,  R.mipmap.hooded_merganser, R.raw.hooded_merganser),
                Bird(28, "Duck", "long tailed duck",null,  R.mipmap.long_tailed_duck, R.raw.long_tailed_duck),
                Bird(29, "Duck", "northern shoveler",null,  R.mipmap.northern_shoveler, R.raw.northern_shoveler),
                Bird(30, "Duck", "ruddy shelduck",null,  R.mipmap.ruddy_shelduck, R.raw.ruddy_shelduck),
                Bird(31, "Duck", "surf scoterk",null,  R.mipmap.surf_scoterk, R.raw.surf_scoterk),
                Bird(32, "Duck", "typical mergansers",null,  R.mipmap.typical_mergansers, R.raw.typical_mergansers),
                Bird(33, "Duck", "velvet scoter",null,  R.mipmap.velvet_scoter, R.raw.velvet_scoter),
                Bird(34, "Duck", "white faced whistling duck",null,  R.mipmap.white_faced_whistling_duck, R.raw.white_faced_whistling_duck),
                Bird(35, "Duck", "lesser whistling duck",null,  R.mipmap.lesser_whistling_duck, R.raw.lesser_whistling_duck),


            )

        }
    }

}