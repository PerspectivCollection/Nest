package com.example.nest

object Constants {
    fun getQustions(): ArrayList<Question>{
        val qustionList = ArrayList<Question>()


        val qui1 = Question(
            1,
            "What is the name of the Goose?",
            R.drawable.barheaded,
            "Barheaded",
            "Cackling",
            "Cereopsis",
            "Coscoroba Prinknash",
            1)
        qustionList.add(qui1)

        val qui2 = Question(
            2,
            "What is the name of the Goose?",
            R.drawable.cackling,
            "Barheaded",
            "Cackling",
            "Cereopsis",
            "Coscoroba Prinknash",
            1)
        qustionList.add(qui2)
        val qui3 = Question(
            3,
            "What is the name of the Goose?",
            R.drawable.cereopsis,
            "coscorobaprinknash",
            "cereopsis",
            "emperor",
            "Cereopsis",
            1)
        qustionList.add(qui3)
        val qui4 = Question(
            4,
            "What is the name of the Goose?",
            R.drawable.coscorobaprinknash,
            "mandarin",
            "cereopsis",
            "coscorobaprinknash",
            "emperor",
            1)
        qustionList.add(qui4)
        val qui5 = Question(
            5,
            "What is the name of the Goose?",
            R.drawable.domesticgoose,
            "mandarin",
            "domesticgoose",
            "emperor",
            "coscorobaprinknash",
            1)
        qustionList.add(qui5)
        val qui6 = Question(
            6,
            "What is the name of the Goose?",
            R.drawable.emperor,
            "emperor",
            "ruddyheaded",
            "domesticgoose",
            "coscorobaprinknash",
            1)
        qustionList.add(qui6)
        val qui7 = Question(
            7,
            "What is the name of the Goose?",
            R.drawable.magpie_goose,
            "magpie_goose",
            "egyption",
            "ruddyheaded",
            "domesticgoose",
            1)
        qustionList.add(qui7)
        val qui8 = Question(
            8,
            "What is the name of the Goose?",
            R.drawable.ruddyheaded,
            "magpie_goose",
            "ruddyheaded",
            "egyption",
            "domesticgoose",
            1)
        qustionList.add(qui8)
        val qui9 = Question(
            9,
            "What is the name of the Goose?",
            R.drawable.egyption,
            "magpie_goose",
            "egyption",
            "ruddyheaded",
            "domesticgoose",
            1)
        qustionList.add(qui9)
        val qui10 = Question(
            10,
            "What is the name of the Goose?",
            R.drawable.domesticgoose,
            "mandarin",
            "magpie_goose",
            "egyption",
            "domesticgoose",
            1)
        qustionList.add(qui10)

        return qustionList
    }
}