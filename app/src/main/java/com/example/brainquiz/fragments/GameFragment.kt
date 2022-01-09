package com.example.brainquiz.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.brainquiz.R
import com.example.brainquiz.data.Progress
import com.example.brainquiz.data.Question
import com.example.brainquiz.data.StorageQuestion
import com.example.brainquiz.databinding.FragmentGameBinding
import com.example.brainquiz.viewmodel.MainViewModel
import kotlin.properties.Delegates
import kotlin.random.Random


class GameFragment : Fragment(R.layout.fragment_game) {

    private var mBinding: FragmentGameBinding? = null
    private var mContext: Context? = null
    private var counter: Int = 0
    private var counterTrueAnswer: Int = 0
    private lateinit var vm: MainViewModel
    var position by Delegates.notNull<Int>()
    lateinit var storageQuestion: StorageQuestion
    lateinit var questionList: ArrayList<Question>
    private val FINISH_RESULT = 5


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }


    override fun onViewCreated(
        view: View, savedInstanceState: Bundle?
    ) {

        val binding = FragmentGameBinding.bind(view)
        mBinding = binding

        vm = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        storageQuestion = mContext?.let { StorageQuestion(context = it) }!!
        questionList = storageQuestion.getList()

        if (vm.isFirstStart.value == true) {
            position = Random.nextInt(0, questionList.size - 1)
            save()
        } else if (vm.progressLive.value?.position!=null) {
            position = vm.progressLive.value?.position!!
        }

        Log.d("MyLog", "position: ${position}")

        activity?.let {
            vm.progressLive.observe(it, Observer {
                counter = it.counter
                counterTrueAnswer = it.true_answer_counter
                if (vm.questListData.value!=null)questionList = vm.questListData.value!!

                if (counter == 0) {
                    questionList = storageQuestion.getList()
                    getQuestions(position)
                } else {
                    position = it.position
                    getQuestions(position)
                }
                Log.d("MyLog", "counter in progressLive $counter")
            })
        }

        with(binding) {
            btnAnswA.setOnClickListener {
                nextQuestion(it.id)
            }
            btnAnswB.setOnClickListener {
                nextQuestion(it.id)
            }
            btnAnswC.setOnClickListener {
                nextQuestion(it.id)
            }
            btnAnswD.setOnClickListener {
                nextQuestion(it.id)
            }
        }
    }

    private fun save() {
        val progress = Progress(position, counter, counterTrueAnswer)
        vm.save(progress, questionList)
    }

    private fun getQuestions(position: Int) {
        if (counter >= FINISH_RESULT) {
            activity?.supportFragmentManager?.beginTransaction()?.replace(
                R.id.data_container,
                ResultFragment()
            )?.addToBackStack(null)?.commit()
        } else {
                Log.d("MyLog", "counter in getQuestions $counter")
                mBinding?.tvQuestion?.text = questionList[position].question
                mBinding?.btnAnswA?.text = questionList[position].answerA
                mBinding?.btnAnswB?.text = questionList[position].answerB
                mBinding?.btnAnswC?.text = questionList[position].answerC
                mBinding?.btnAnswD?.text = questionList[position].answerD

        }
    }

    private fun nextQuestion(id: Int) {
            when (id) {
                R.id.btnAnswA -> {
                    if (mBinding?.btnAnswA?.text.toString() == questionList[position].true_answer) {
                        counterTrueAnswer++
                    }
                }
                R.id.btnAnswB -> {
                    if (mBinding?.btnAnswB?.text.toString() == questionList[position].true_answer) {
                        counterTrueAnswer++
                    }
                }
                R.id.btnAnswC -> {
                    if (mBinding?.btnAnswC?.text.toString() == questionList[position].true_answer) {
                        counterTrueAnswer++
                    }
                }
                R.id.btnAnswD -> {
                    if (mBinding?.btnAnswD?.text.toString() == questionList[position].true_answer) {
                        counterTrueAnswer++
                    }
                }
            }

        Log.d("MyLog", "counterTrueAnswer: ${counterTrueAnswer}")
        counter++
        questionList.removeAt(position)
        if (questionList.size == 1 || questionList.size == 0) {
            position = 0
        } else {
            position = Random.nextInt(0, questionList.size)
        }
        getQuestions(position)
        save()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }

}