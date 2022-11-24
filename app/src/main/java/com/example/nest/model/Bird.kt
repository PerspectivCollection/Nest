package com.example.nest.model

import com.example.nest.R


data class Bird(val id: Int, var typeBird: String?,  var name: String?, var name_latin: String?, var image: Int, var audio: Int?, var unlocked : Boolean?) {

    companion object {
        fun getBird(): List<Bird> {

            return listOf(
                Bird(1, "Duck", "Mandarin Duck",null,  R.mipmap.mandarin_duck, R.raw.mandarian_duck, false),
                Bird(2, "Duck", "Northern Pintall",null,  R.mipmap.northern_pintall, R.raw.northern_pintail, false),
                Bird(3, "Duck", "Wood Duck",null,  R.mipmap.wood_duck, R.raw.wood_duck, false),
                Bird(4, "Duck", "American Wigeon",null,  R.mipmap.american_wigeon, R.raw.american_wigeon, false),
                Bird(6, "Duck", "american black duck",null,  R.mipmap.american_black_duck, R.raw.american_black_duck, false),
                Bird(7, "Duck", "baikal teal",null,  R.mipmap.baikal_teal, R.raw.baikal_teal , false),
                Bird(8, "Duck", "barrow goldeneye",null,  R.mipmap.barrow_goldeneye, R.raw.barrow_goldeneye, false),
                Bird(9, "Duck", "blackellied whistling",null,  R.mipmap.blackellied_whistling, R.raw.blackelliedwhistling, false),
                Bird(10, "Duck", "blue winged teal",null,  R.mipmap.blue_winged_teal, R.raw.blue_winged_teal, false),
                Bird(11, "Duck", "brazilian teal",null,  R.mipmap.brazilian_teal, R.raw.brazilian_teal, false),
                Bird(12, "Duck", "bufflehead",null,  R.mipmap.bufflehead, R.raw.bufflehead, false),
                Bird(13, "Duck", "cinnamon teal",null,  R.mipmap.cinnamon_treal, R.raw.cinnamon_teal, false),
                Bird(14, "Duck", "common goldeneye",null,  R.mipmap.common_goldeneye, R.raw.common_goldeneye, false),
                Bird(15, "Duck", "common pochard",null,  R.mipmap.common_pochard, R.raw.common_pochard, false),
                Bird(16, "Duck", "common scoter",null,  R.mipmap.common_scoter, R.raw.common_scoter, false),
                Bird(17, "Duck", "common shelduck",null,  R.mipmap.common_shelduck, R.raw.common_shelduck, false),
                Bird(18, "Duck", "eurasian teal",null,  R.mipmap.eurasian_teal, R.raw.eurasian_teal, false),
                Bird(19, "Duck", "eurasian wigeon",null,  R.mipmap.eurasian_wigeon, R.raw.eurasian_wigeon, false),
                Bird(20, "Duck", "ferruginous duck",null,  R.mipmap.ferruginous_duck, R.raw.ferruginous_duck, false),
                Bird(21, "Duck", "fulvous whisling duck",null,  R.mipmap.fulvous_whisling_duck, R.raw.fulvous_whisling_duck, false),
                Bird(22, "Duck", "king eider",null,  R.mipmap.king_eider, R.raw.king_eider, false),
                Bird(23, "Duck", "gadwall",null,  R.mipmap.gadwall, R.raw.gadwall, false),
                Bird(24, "Duck", "garganey",null,  R.mipmap.garganey, R.raw.garganey, false),
                Bird(25, "Duck", "greater scaup",null,  R.mipmap.greater_scaup, R.raw.greaterscaup, false),
                Bird(26, "Duck", "green winged teal",null,  R.mipmap.green_winged_teal, R.raw.green_winged_teal, false),
                Bird(27, "Duck", "hooded merganser",null,  R.mipmap.hooded_merganser, R.raw.hooded_merganser, false),
                Bird(28, "Duck", "long tailed duck",null,  R.mipmap.long_tailed_duck, R.raw.long_tailed_duck, false),
                Bird(29, "Duck", "northern shoveler",null,  R.mipmap.northern_shoveler, R.raw.northern_shoveler, false),
                Bird(30, "Duck", "ruddy shelduck",null,  R.mipmap.ruddy_shelduck, R.raw.ruddy_shelduck, false),
                Bird(31, "Duck", "surf scoterk",null,  R.mipmap.surf_scoterk, R.raw.surf_scoterk, false),
                Bird(32, "Duck", "typical mergansers",null,  R.mipmap.typical_mergansers, R.raw.typical_mergansers, false),
                Bird(33, "Duck", "velvet scoter",null,  R.mipmap.velvet_scoter, R.raw.velvet_scoter, false),
                Bird(34, "Duck", "white faced whistling duck",null,  R.mipmap.white_faced_whistling_duck, R.raw.white_faced_whistling_duck, false),
                Bird(35, "Duck", "lesser whistling duck",null,  R.mipmap.lesser_whistling_duck, R.raw.lesser_whistling_duck, false),

                Bird(36, "Goose", "Adler goose",null,  R.mipmap.adler_goose, null, false),
                Bird(37, "Goose", "African goose",null,  R.mipmap.african_goose, null, false),
                Bird(38, "Goose", "Alsatian goose",null,  R.mipmap.alsatian_goose, null, false),
                Bird(39, "Goose", "American buff goose ",null,  R.mipmap.american, null, false),
                Bird(40, "Goose", "Amorstream goose",null,  R.mipmap.amorstream_goose, null, false),
                Bird(41, "Goose", "Anhui goose",null,  R.mipmap.anhui_goose, null, false),
                Bird(42, "Goose", "Aonghus goos",null,  R.mipmap.aonghus_goos, null, false),
                Bird(43, "Goose", "Arzamas goose ",null,  R.mipmap.arzamas_goose, null, false),
                Bird(44, "Goose", "Austrian landrace",null,  R.mipmap.austrian_landrace, null, false),
                Bird(45, "Goose", "Balien Eu goose",null,  R.mipmap.balien_eu_goose, null, false),
                Bird(46, "Goose", "Bavarian landrace",null,  R.mipmap.bavarian_landrace, null, false),
                Bird(47, "Goose", "Benkov goose",null,  R.mipmap.benkov_goose, null, false),


                Bird(48, "Goose", "Bilgorey goose",null,  0, null, false),
                Bird(49, "Goose", "Bogdanovski goos",null,  0, null, false),
                Bird(50, "Goose", "Bourbon goos",null,  0, null, false),

                Bird(50, "Goose", "Bourbon goos",null,  R.mipmap.bourbon_goose, null, false),

                Bird(51, "Goose", "Brecon buff goose",null,  0, null, false),
                Bird(52, "Goose", "Buff back goose ",null,  0, null, false),


                Bird(52, "Goose", "Buff back goose ",null,  R.mipmap.buff_back_goose, null, false),
                Bird(53, "Goose", "Celle goose",null,  R.mipmap.celle_goose, null, false),


                Bird(54, "Goose", "Changle goose",null,  0, null, false),


                Bird(55, "Goose", "Chinese goose ",null,  R.mipmap.chinese_goose, null, false),

                Bird(56, "Goose", "Co goose",null,  0, null, false),
                Bird(57, "Goose", "Cotton Patch goos",null,  0, null, false),
                Bird(58, "Goose", "Curly breasted Sebastopol goose",null,  0, null, false),
                Bird(59, "Goose", "Czech goose",null,  0, null, false),
                Bird(60, "Goose", "Czech crested goose ",null,  0, null, false),
                Bird(61, "Goose", "Danish landrace goose ",null,  0, null, false),
                Bird(62, "Goose", "Daoxian goose",null,  0, null, false),
                Bird(63, "Goose", "Diepholz goose ",null,  0, null, false),
                Bird(64, "Goose", "Drava goos",null,  0, null, false),
                Bird(65, "Goose", "Emden goose   ",null,  0, null, false),
                Bird(66, "Goose", "Emporda goose ",null,  0, null, false),
                Bird(67, "Goose", "English saddleback goose",null,  0, null, false),
                Bird(68, "Goose", "Euskal Antzara goos",null,  0, null, false),
                Bird(69, "Goose", "Faroese goose",null,  0, null, false),
                Bird(70, "Goose", "Fighting goose ",null,  0, null, false),
                Bird(71, "Goose", "Flemish goose",null,  0, null, false),
                Bird(72, "Goose", "Franconian goose ",null,  0, null, false),
                Bird(73, "Goose", "Garbonosa goose",null,  0, null, false),
                Bird(74, "Goose", "German laying goose  ",null,  0, null, false),
                Bird(75, "Goose", "Gorki goos",null,  0, null, false),
                Bird(76, "Goose", "Gorkowska goose",null,  0, null, false),
                Bird(77, "Goose", "Greyback goos",null,  0, null, false),
                Bird(78, "Goose", "Han Tah Pra goose",null,  0, null, false),
                Bird(79, "Goose", "Hawaiian goose",null,  0, null, false),
                Bird(80, "Goose", "Hungarian goose",null,  0, null, false),
                Bird(81, "Goose", "Huoyan goose",null,  0, null, false),
                Bird(82, "Goose", "Hwo goose",null,  0, null, false),
                Bird(83, "Goose", "Javakhetian goose ",null,  0, null, false),
                Bird(84, "Goose", "Kaluga goose",null,  0, null, false),
                Bird(85, "Goose", "Kangan goose",null,  0, null, false),
                Bird(86, "Goose", "Kartuzy landrace",null,  0, null, false),
                Bird(87, "Goose", "Kholmogory goose",null,  0, null, false),
                Bird(88, "Goose", "Kielce landrace",null,  0, null, false),
                Bird(89, "Goose", "Koean goose",null,  0, null, false),
                Bird(90, "Goose", "Krasnozerskoye goose ",null,  0, null, false),
                Bird(91, "Goose", "Kuban goose ",null,  0, null, false),
                Bird(92, "Goose", "Landes goose ",null,  0, null, false),
                Bird(93, "Goose", "Large grey goose",null,  0, null, false),
                Bird(94, "Goose", "Leine goose",null,  0, null, false),
                Bird(95, "Goose", "Lingzian goose",null,  0, null, false),
                Bird(96, "Goose", "Likewu goose",null,  0, null, false),
                Bird(97, "Goose", "Lionhead goose",null,  0, null, false),
                Bird(98, "Goose", "Lippe goose ",null,  0, null, false),
                Bird(99, "Goose", "Local geese of Karal and Massakory",null,  0, null, false),
                Bird(100, "Goose", "Local goose of Mandelia",null,  0, null, false),
                Bird(101, "Goose", "Lubelska goose",null,  0, null, false),
            )
        }
    }
}
