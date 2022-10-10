import com.example.nest.Question


object DataSet {
    fun getQuestion(): ArrayList<Question> {
        var questionList = ArrayList<Question>()


        val question1 = Question(
            1,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )

        val question2 = Question(
            2,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )

        val question3 = Question(
            3,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )

        val question4 = Question(
            4,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )

        val question5 = Question(
            5,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )

        val question6 = Question(
            6,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )

        val question7 = Question(
            7,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )

        val question8 = Question(
            8,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )

        val question9 = Question(
            9,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )
        val question10 = Question(
            10,
            "Guess Who?",
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )
        questionList.add(question1)
        questionList.add(question2)
        questionList.add(question3)
        questionList.add(question4)
        questionList.add(question5)
        questionList.add(question6)
        questionList.add(question7)
        questionList.add(question8)
        questionList.add(question9)
        questionList.add(question10)


        return questionList
    }
}