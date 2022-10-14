package com.example.nest.navigationdraw

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.InputFilter.LengthFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.nest.Question

import com.example.nest.R


//model
import com.example.nest.databinding.FragmentGuesswhoBinding

class NameQuizFragment : Fragment() {

    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSeleOptionPos : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        setContentView(R.layout.activity_quistion)

        mQuestionList = Constants.getQustions()
        setQuestion()

        first_qustion.setOnClickListener(this)
        secend_qustion.setOnClickListener(this)
        third_qustion.setOnClickListener(this)
        four_qustion.setOnClickListener(this)



    }
    private fun setQuestion(){

        mCurrentPosition = 1
        val question = mQuestionList!![mCurrentPosition -1]

        defaultOptionView()

        if(mCurrentPosition == mQuestionList!!.size){
            submit_id.text= "FINISH"
        }
        else{
            submit_id.text = "SUBMIT"
        }

        progress20.progress = mCurrentPosition
        progresses.text="$mCurrentPosition" + "/" + progress20.max

        main_Question.text= question !!.question
        image1.setImageResource(question.image)
        first_qustion.text=question.optionOne
        secend_qustion.text=question.optionOne
        third_qustion.text=question.optionOne
        four_qustion.text=question.optionOne
        submit_id.setOnClickListener(this)
    }

    private fun defaultOptionView(){
        val option = ArrayList<TextView>()
        option.add(0,first_qustion)
        option.add(1,secend_qustion)
        option.add(2,third_qustion)
        option.add(3,four_qustion)


        for(options in option){
            options.setTextColor(Color.parseColor("#7A8089"))
            options.typeface = Typeface.DEFAULT
            options.background = ContextCompat.getDrawable(this,
                R.drawable.quiz_bakground)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.first_qustion ->{
                selectedOptionView(first_qustion,1 )
            }
            R.id.secend_qustion ->{
                selectedOptionView(secend_qustion,2 )
            }
            R.id.third_qustion ->{
                selectedOptionView(third_qustion,3)
            }
            R.id.four_qustion ->{
                selectedOptionView(four_qustion,4 )
            }
            R.id.submit_id -> {
                if(mSeleOptionPos == 0){
                    mCurrentPosition ++


                    when{
                        mCurrentPosition <= mQuestionList !!.size -> {
                            setQuestion()
                        }
                        else ->{
                            Toast.makeText(this,"You have successfully completed the Quiz",
                                Toast.LENGTH_SHORT).show()
                        }
                    }

                }
                else{
                    val question = mQuestionList?.get (mCurrentPosition-1)
                    if(question!!. corretOption != mSeleOptionPos){
                        answarView(mSeleOptionPos, R.drawable.redc)
                    }
                    answarView(question.corretOption, R.drawable.green1)

                    if(mCurrentPosition == mQuestionList!!.size){
                        start_btn.text="Finish"
                    }
                    start_btn.text="NEXT QUISTION"
                }
                mSeleOptionPos = 0


            }
        }

    }
    private fun answarView(ans: Int, drawView: Int){
        when(ans){
            1 ->{
                first_qustion.background = ContextCompat.getDrawable(
                    this@QuestionsActivity,drawView
                )                }

            2 ->{
                secend_qustion.background = ContextCompat.getDrawable(
                    this@QuestionsActivity, drawView
                )
            }

            3->{
                third_qustion.background = ContextCompat.getDrawable(
                    this@QuestionsActivity, drawView
                )

            }

            4 ->{
                four_qustion .background = ContextCompat.getDrawable(
                    this@QuestionsActivity, drawView
                )

            }
        }

    }
    private fun selectedOptionView(op: TextView, selectedOptionNum: Int){
        defaultOptionView()
        mSeleOptionPos = selectedOptionNum

        op.setTextColor(Color.parseColor("#363A43"))
        op.setTypeface(op.typeface, Typeface.BOLD)
        op.background = ContextCompat.getDrawable(
            this,
            R.drawable.redc)
 */
    }


}