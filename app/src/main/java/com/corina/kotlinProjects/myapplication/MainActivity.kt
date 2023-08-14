package com.corina.kotlinProjects.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.corina.kotlinProjects.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var currentQuestionIndex = 0
    private var correctAnswersCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayQuestion(currentQuestionIndex)
        setButtonListeners()
    }
// zeigt aktuelle Frage und die zugehörigen Antwortoptionen an, nimmt Index als Parameter, der angibt, welche Frage aus der Liste QuizQuestion.questions angezeigt werden soll.
    private fun displayQuestion(index: Int) {
        val question = QuizQuestion.questions[index]
        binding.tvQuestionTitle.text = question.question
        binding.btnOption1.text = question.options[0]
        binding.btnOption2.text = question.options[1]
        binding.btnOption3.text = question.options[2]
    }

// setzt ClickListener, wenn Klick = Methode checkAnswer wird aufgerufen nach Prüfung der Antwort wird proceedToNextQuestionOrShowResults aufgerufen
    private fun setButtonListeners() {
        binding.btnOption1.setOnClickListener {
            checkAnswer(0)
            proceedToNextQuestionOrShowResults()
        }

        binding.btnOption2.setOnClickListener {
            checkAnswer(1)
            proceedToNextQuestionOrShowResults()
        }
        binding.btnOption3.setOnClickListener {
            checkAnswer(2)
            proceedToNextQuestionOrShowResults()
        }
    binding.btnRestart.setOnClickListener {
        correctAnswersCount = 0
        currentQuestionIndex = 0
        displayQuestion(currentQuestionIndex)
        binding.btnRestart.visibility = View.GONE
    }
    }

    private fun checkAnswer(selectedOption: Int) {
        if (selectedOption == QuizQuestion.questions[currentQuestionIndex].correctAnswerIndex) {
            correctAnswersCount++
            Toast.makeText(this, "Hurra, die Antwort ist richtig.", Toast.LENGTH_SHORT).show()

        } else {
            Toast.makeText(this, "Schade, die Antwort ist leider falsch.", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun proceedToNextQuestionOrShowResults() {
        if (currentQuestionIndex == QuizQuestion.questions.size - 1) {
            showResult()
        } else {
            currentQuestionIndex++
            displayQuestion(currentQuestionIndex)
        }
    }

    private fun showResult() {
        Toast.makeText(
            this,
            "Sie haben$correctAnswersCount von ${QuizQuestion.questions.size} Fragen richtig beantwortet!",
            Toast.LENGTH_LONG
        ).show()
        binding.btnRestart.visibility = View.VISIBLE
    }
}
