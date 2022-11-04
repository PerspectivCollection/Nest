package com.example.nest.model

import com.example.nest.R


//data class Bird(val id: Int?, val typeBird: String?,  val name: String?, val name_latin: String?, val image: Int?) {
data class Bird(val id: Int, var typeBird: String?,  var name: String?, var name_latin: String?, var image: Int?, var audio: Int?) {

    companion object {
        fun getBird(): List<Bird> {

            return listOf(Bird(70, "Goose", "Fighting goose ",null,  null, null),
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