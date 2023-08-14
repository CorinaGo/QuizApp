package com.corina.kotlinProjects.myapplication

data class QuizData (
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int

)