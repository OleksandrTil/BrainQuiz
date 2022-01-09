package com.example.brainquiz.viewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.brainquiz.data.Progress
import com.example.brainquiz.data.Question


class MainViewModel: ViewModel() {

    var progressLive = MutableLiveData<Progress>()
    var questListData = MutableLiveData<ArrayList<Question>>()
    var isFirstStart = MutableLiveData<Boolean>()

    init {
        isFirstStart.value = true
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun save(progress: Progress, questionList: ArrayList<Question>) {
           val current_progress = Progress(
               position = progress.position,
               counter = progress.counter,
               true_answer_counter = progress.true_answer_counter
           )
           questListData.value = questionList
           progressLive.value = current_progress
           isFirstStart.value = false
    }

    fun clear() {
        progressLive.value?.position = 0
        progressLive.value?.counter = 0
        progressLive.value?.true_answer_counter = 0
        isFirstStart.value = true
    }

}