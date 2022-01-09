package com.example.brainquiz.data

import android.content.Context
import com.example.brainquiz.R

class StorageQuestion(context: Context) {

    var questionArray: ArrayList<Question> = arrayListOf()

    init {
        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question1_title),
                answerA = context.resources.getString(R.string.answer1A),
                answerB = context.resources.getString(R.string.answer1B),
                answerC = context.resources.getString(R.string.answer1C),
                answerD = context.resources.getString(R.string.answer1D),
                true_answer = context.resources.getString(R.string.question1_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question2_title),
                answerA = context.resources.getString(R.string.answer2A),
                answerB = context.resources.getString(R.string.answer2B),
                answerC = context.resources.getString(R.string.answer2C),
                answerD = context.resources.getString(R.string.answer2D),
                true_answer = context.resources.getString(R.string.question2_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question3_title),
                answerA = context.resources.getString(R.string.answer3A),
                answerB = context.resources.getString(R.string.answer3B),
                answerC = context.resources.getString(R.string.answer3C),
                answerD = context.resources.getString(R.string.answer3D),
                true_answer = context.resources.getString(R.string.question3_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question4_title),
                answerA = context.resources.getString(R.string.answer4A),
                answerB = context.resources.getString(R.string.answer4B),
                answerC = context.resources.getString(R.string.answer4C),
                answerD = context.resources.getString(R.string.answer4D),
                true_answer = context.resources.getString(R.string.question4_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question5_title),
                answerA = context.resources.getString(R.string.answer5A),
                answerB = context.resources.getString(R.string.answer5B),
                answerC = context.resources.getString(R.string.answer5C),
                answerD = context.resources.getString(R.string.answer5D),
                true_answer = context.resources.getString(R.string.question5_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question6_title),
                answerA = context.resources.getString(R.string.answer6A),
                answerB = context.resources.getString(R.string.answer6B),
                answerC = context.resources.getString(R.string.answer6C),
                answerD = context.resources.getString(R.string.answer6D),
                true_answer = context.resources.getString(R.string.question6_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question7_title),
                answerA = context.resources.getString(R.string.answer7A),
                answerB = context.resources.getString(R.string.answer7B),
                answerC = context.resources.getString(R.string.answer7C),
                answerD = context.resources.getString(R.string.answer7D),
                true_answer = context.resources.getString(R.string.question7_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question8_title),
                answerA = context.resources.getString(R.string.answer8A),
                answerB = context.resources.getString(R.string.answer8B),
                answerC = context.resources.getString(R.string.answer8C),
                answerD = context.resources.getString(R.string.answer8D),
                true_answer = context.resources.getString(R.string.question8_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question9_title),
                answerA = context.resources.getString(R.string.answer9A),
                answerB = context.resources.getString(R.string.answer9B),
                answerC = context.resources.getString(R.string.answer9C),
                answerD = context.resources.getString(R.string.answer9D),
                true_answer = context.resources.getString(R.string.question9_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question10_title),
                answerA = context.resources.getString(R.string.answer10A),
                answerB = context.resources.getString(R.string.answer10B),
                answerC = context.resources.getString(R.string.answer10C),
                answerD = context.resources.getString(R.string.answer10D),
                true_answer = context.resources.getString(R.string.question10_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question11_title),
                answerA = context.resources.getString(R.string.answer11A),
                answerB = context.resources.getString(R.string.answer11B),
                answerC = context.resources.getString(R.string.answer11C),
                answerD = context.resources.getString(R.string.answer11D),
                true_answer = context.resources.getString(R.string.question11_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question12_title),
                answerA = context.resources.getString(R.string.answer12A),
                answerB = context.resources.getString(R.string.answer12B),
                answerC = context.resources.getString(R.string.answer12C),
                answerD = context.resources.getString(R.string.answer12D),
                true_answer = context.resources.getString(R.string.question12_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question13_title),
                answerA = context.resources.getString(R.string.answer13A),
                answerB = context.resources.getString(R.string.answer13B),
                answerC = context.resources.getString(R.string.answer13C),
                answerD = context.resources.getString(R.string.answer13D),
                true_answer = context.resources.getString(R.string.question13_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question14_title),
                answerA = context.resources.getString(R.string.answer14A),
                answerB = context.resources.getString(R.string.answer14B),
                answerC = context.resources.getString(R.string.answer14C),
                answerD = context.resources.getString(R.string.answer14D),
                true_answer = context.resources.getString(R.string.question14_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question15_title),
                answerA = context.resources.getString(R.string.answer15A),
                answerB = context.resources.getString(R.string.answer15B),
                answerC = context.resources.getString(R.string.answer15C),
                answerD = context.resources.getString(R.string.answer15D),
                true_answer = context.resources.getString(R.string.question15_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question16_title),
                answerA = context.resources.getString(R.string.answer16A),
                answerB = context.resources.getString(R.string.answer16B),
                answerC = context.resources.getString(R.string.answer16C),
                answerD = context.resources.getString(R.string.answer16D),
                true_answer = context.resources.getString(R.string.question16_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question17_title),
                answerA = context.resources.getString(R.string.answer17A),
                answerB = context.resources.getString(R.string.answer17B),
                answerC = context.resources.getString(R.string.answer17C),
                answerD = context.resources.getString(R.string.answer17D),
                true_answer = context.resources.getString(R.string.question17_true_answer)
            )
        )

        questionArray.add(
            Question(
                question = context.resources.getString(R.string.question18_title),
                answerA = context.resources.getString(R.string.answer18A),
                answerB = context.resources.getString(R.string.answer18B),
                answerC = context.resources.getString(R.string.answer18C),
                answerD = context.resources.getString(R.string.answer18D),
                true_answer = context.resources.getString(R.string.question18_true_answer)
            )
        )
    }

    fun getList(): ArrayList<Question> {
        return questionArray
    }

}
