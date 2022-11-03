package com.example.nest.namequiz

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.nest.R
import com.example.nest.databinding.FragmentQustionQuizGameBinding


class QustionQuizGame : Fragment(), View.OnClickListener{
    lateinit var binding: FragmentQustionQuizGameBinding
    private lateinit var mQuestionsList : ArrayList<Question>
    private  var mSelectedPosition: Int = 0
    private var mCorrectAnswer : Int = 0
    var mCurrrentPosition: Int = 1


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_qustion_quiz_game, container, false)
        mQuestionsList = Constanst.getQuestion()

        Log.i("info", mCurrrentPosition.toString())

        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
        binding.option1.setOnClickListener(this)

        setQuestion()
        return binding.root
    }
    private fun setQuestion() {


        val question: Question = mQuestionsList[mCurrrentPosition -1]

        binding.QuestionId.text = question.question
        binding.imageView.setImageResource(question.image)
        binding.option1.text = question.optionOne
        binding.option2.text = question.optionTwo
        binding.option3.text = question.optionThree
        binding.option4.text = question.optionFoure

        binding.pb.progress = mCurrrentPosition
        binding.progressBar.text = "$mCurrrentPosition" + "/" + binding.pb.max

        defaultNewQuation()
        if (mCurrrentPosition == mQuestionsList.size){

            binding.btnSubmit.text = "Quiz Finished"

        } else {

            binding.btnSubmit.text = "Submit"
    }
}

    private fun defaultNewQuation() {

        //controlling textview that share same behavior

        val options = ArrayList<TextView>()
        options.add(0, binding.option1)
        options.add(1, binding.option2)
        options.add(2, binding.option3)
        options.add(3, binding.option4)


        for (option in options) {


            option.setTextColor(Color.parseColor("#7A8089"))
            //default appearance
            option.typeface = Typeface.DEFAULT
        }


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option1->{
                Toast.makeText(context, "clicked option 1", Toast.LENGTH_SHORT).show()

            }
            R.id.option2->{Toast.makeText(context, "clicked option 2", Toast.LENGTH_SHORT).show()

            }
            R.id.option3->{Toast.makeText(context, "clicked option 3", Toast.LENGTH_SHORT).show()

            }
            R.id.option4->{Toast.makeText(context, "clicked option 4", Toast.LENGTH_SHORT).show()

            }
            R.id.btnSubmit->{Toast.makeText(context, "clicked Submit", Toast.LENGTH_SHORT).show()

            }
        }
    }
}
