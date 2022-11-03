package com.example.nest.screensall.namequiz

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
import androidx.navigation.fragment.findNavController
import com.example.nest.R
import com.example.nest.databinding.FragmentQustionQuizGameBinding
import com.example.nest.model.Constanst
import com.example.nest.model.Question


class QustionQuizGame : Fragment(), View.OnClickListener {
    lateinit var binding: FragmentQustionQuizGameBinding
    private lateinit var mQuestionsList: ArrayList<Question>
    private var mSelectedPosition: Int = 0
    private var mCorrectAnswer: Int = 0
    var mCurrrentPosition: Int = 1


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_qustion_quiz_game, container, false)
        mQuestionsList = Constanst.getQuestion()

        Log.i("info", mCurrrentPosition.toString())

        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
        binding.option1.setOnClickListener(this)


        binding.btnSubmit.setOnClickListener {
            findNavController().navigate(R.id.resultFragment)
        }

        setQuestion()
        return binding.root
    }

    private fun setQuestion() {


        val question: Question = mQuestionsList[mCurrrentPosition - 1]

        binding.QuestionId.text = question.question
        binding.imageView.setImageResource(question.image)
        binding.option1.text = question.optionOne
        binding.option2.text = question.optionTwo
        binding.option3.text = question.optionThree
        binding.option4.text = question.optionFoure

        binding.pb.progress = mCurrrentPosition
        binding.progressBar.text = "$mCurrrentPosition" + "/" + binding.pb.max

        defaultNewQuation()
        if (mCurrrentPosition == mQuestionsList.size) {

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
            option.typeface = Typeface.DEFAULT
        }


    }

    override fun onClick(V: View?) {
        when (V?.id) {
            R.id.option1 -> {
                selectedOptionView(binding.option1, 1)

            }
            R.id.option2 -> {
                selectedOptionView(binding.option2, 2)

            }
            R.id.option3 -> {
                selectedOptionView(binding.option3, 3)

            }
            R.id.option4 -> {
                selectedOptionView(binding.option4, 4)

            }
            R.id.btnSubmit -> {
                if (mSelectedPosition == 0) {
                    mCurrrentPosition++
                    when {
                        mCurrrentPosition <= mQuestionsList.size -> {
                            setQuestion()
                        }
                        else -> {

                            Toast.makeText(context, "Finish !!", Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {

                    val question = mQuestionsList[mCurrrentPosition - 1]

                    if (question!!.corretAns != mSelectedPosition) {
                        answerView(
                            mCurrrentPosition,
                            R.color.md_theme_dark_tertiary
                        )
                    } else {
                        mCorrectAnswer++
                        answerView(question.corretAns, R.color.md_theme_dark_tertiary)

                        if (mCurrrentPosition == mQuestionsList.size) {
                            binding.btnSubmit.text = "Finished"
                        } else {
                            binding.btnSubmit.text = "Next Question"
                        }
                    }

                    mSelectedPosition = 0
                }

            }

        }
    }

    private fun selectedOptionView(option: TextView, selectedPosition: Int) {

        defaultNewQuation()

        mSelectedPosition = selectedPosition



        option.setTextColor(Color.parseColor("#363A43"))
        option.setTypeface(option.typeface, Typeface.BOLD)
        option.background = context?.let {
            ContextCompat.getDrawable(it, R.color.md_theme_dark_tertiary)
        }

    }

    private fun answerView(mSelectedPosition: Int, color: Int) {
        when (mSelectedPosition) {
            1 -> {
                binding.option1.background = context?.let {
                    ContextCompat.getDrawable(it, color)
                }
            }
            2 -> {
                binding.option1.background = context?.let {
                    ContextCompat.getDrawable(it, color)
                }
            }

            3 -> {
                binding.option1.background = context?.let {
                    ContextCompat.getDrawable(it, color)
                }
            }

            4 -> {
                binding.option1.background = context?.let {
                    ContextCompat.getDrawable(it, color)
                }
            }


        }

    }
}




