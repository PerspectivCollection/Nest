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

                Bird(36, "Goose", "Adler goose ",null,  null, null),
                Bird(37, "Goose", "African goose  ",null,  null, null),
                Bird(38, "Goose", "Alsatian goose  ",null,  null, null),
                Bird(39, "Goose", "American buff goose ",null,  null, null),
                Bird(40, "Goose", "Amorstream goose",null,  null, null),
                Bird(41, "Goose", "Anhui goose",null,  null, null),
                Bird(42, "Goose", "Aonghus goos",null,  null, null),
                Bird(43, "Goose", "Arzamas goose ",null,  null, null),
                Bird(44, "Goose", "Austrian landrace",null,  null, null),
                Bird(45, "Goose", "Balien Eu goose",null,  null, null),
                Bird(46, "Goose", "Bavarian landrace",null,  null, null),
                Bird(47, "Goose", "Benkov goose",null,  null, null),
                Bird(48, "Goose", "Bilgorey goose",null,  null, null),
                Bird(49, "Goose", "Bogdanovski goos",null,  null, null),
                Bird(50, "Goose", "Bourbon goos",null,  null, null),
                Bird(51, "Goose", "Brecon buff goose",null,  null, null),
                Bird(52, "Goose", "Buff back goose ",null,  null, null),
                Bird(53, "Goose", "Celle goose   Celler Gans   ",null,  null, null),
                Bird(54, "Goose", "Changle goose",null,  null, null),
                Bird(55, "Goose", "Chinese goose ",null,  null, null),
                Bird(56, "Goose", "Co goose",null,  null, null),
                Bird(57, "Goose", "Cotton Patch goos",null,  null, null),
                Bird(58, "Goose", "Curly breasted Sebastopol goose",null,  null, null),
                Bird(59, "Goose", "Czech goose",null,  null, null),
                Bird(60, "Goose", "Czech crested goose ",null,  null, null),
                Bird(61, "Goose", "Danish landrace goose ",null,  null, null),
                Bird(62, "Goose", "Daoxian goose",null,  null, null),
                Bird(63, "Goose", "Diepholz goose ",null,  null, null),
                Bird(64, "Goose", "Drava goos",null,  null, null),
                Bird(65, "Goose", "Emden goose   ",null,  null, null),
                Bird(66, "Goose", "Emporda goose ",null,  null, null),
                Bird(67, "Goose", "English saddleback goose",null,  null, null),
                Bird(68, "Goose", "Euskal Antzara goos",null,  null, null),
                Bird(69, "Goose", "Faroese goose",null,  null, null),
                Bird(70, "Goose", "Fighting goose ",null,  null, null),
                Bird(71, "Goose", "Flemish goose",null,  null, null),
                Bird(72, "Goose", "Franconian goose ",null,  null, null),
                Bird(73, "Goose", "Garbonosa goose",null,  null, null),
                Bird(74, "Goose", "German laying goose  ",null,  null, null),
                Bird(75, "Goose", "Gorki goos",null,  null, null),
                Bird(76, "Goose", "Gorkowska goose",null,  null, null),
                Bird(77, "Goose", "Greyback goos",null,  null, null),
                Bird(78, "Goose", "Han Tah Pra goose",null,  null, null),
                Bird(79, "Goose", "Hawaiian goose",null,  null, null),
                Bird(80, "Goose", "Hungarian goose",null,  null, null),
                Bird(81, "Goose", "Huoyan goose",null,  null, null),
                Bird(82, "Goose", "Hwo goose",null,  null, null),
                Bird(83, "Goose", "Javakhetian goose ",null,  null, null),
                Bird(84, "Goose", "Kaluga goose",null,  null, null),
                Bird(85, "Goose", "Kangan goose",null,  null, null),
                Bird(86, "Goose", "Kartuzy landrace",null,  null, null),
                Bird(87, "Goose", "Kholmogory goose",null,  null, null),
                Bird(88, "Goose", "Kielce landrace",null,  null, null),
                Bird(89, "Goose", "Koean goose",null,  null, null),
                Bird(90, "Goose", "Krasnozerskoye goose ",null,  null, null),
                Bird(91, "Goose", "Kuban goose ",null,  null, null),
                Bird(92, "Goose", "Landes goose ",null,  null, null),
                Bird(93, "Goose", "Large grey goose",null,  null, null),
                Bird(94, "Goose", "Leine goose",null,  null, null),
                Bird(95, "Goose", "Lingzian goose",null,  null, null),
                Bird(96, "Goose", "Likewu goose",null,  null, null),
                Bird(97, "Goose", "Lionhead goose",null,  null, null),
                Bird(98, "Goose", "Lippe goose ",null,  null, null),
                Bird(99, "Goose", "Local geese of Karal and Massakory",null,  null, null),
                Bird(100, "Goose", "Local goose of Mandelia",null,  null, null),
                Bird(101, "Goose", "Lubelska goose",null,  null, null),

            )

        }
    }

}