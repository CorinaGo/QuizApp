package com.corina.kotlinProjects.myapplication

class QuizQuestion {
    companion object {
        val questions = listOf(
            QuizData(
                question = "Was bedeutet das Wort \"rudimentär\"?",
                options = listOf("fortgeschritten", "primitiv oder unentwickelt", "wiederholend"),
                correctAnswerIndex = 1
            ),
            QuizData(
                question = "Was beschreibt das Wort \"rekursiv\"?",
                options = listOf(
                    "Etwas, das in einer festen Reihenfolge erfolgt.",
                    "Etwas, das sich selbst wiederholt oder auf sich selbst zurückgreift.",
                    "Etwas, das ständig in Bewegung ist, ohne Pause."
                ),
                correctAnswerIndex = 1
            ),
            QuizData(
                question = "Was bedeutet das Wort \"äquivalent\"?",
                options = listOf("fortgeschritten", "primitiv oder unentwickelt", "gleichwertig "),
                correctAnswerIndex = 2
            ),
            QuizData(
                question = "Was beschreibt eine \"Koroutine\" in einem Kontext der Ablaufsteuerung?",
                options = listOf(
                    " Eine Routine, die nach einem festen Zeitplan ausgeführt wird.",
                    "Eine Routine, die unabhängig und ohne Unterbrechung läuft.",
                    "Eine Routine, die ihre Ausführung unterbrechen und zu einem späteren Zeitpunkt fortsetzen kann."
                ),
                correctAnswerIndex = 2
            ),
            QuizData(
                question = "Was bedeutet das Wort \"konkis\"?",
                options = listOf("ausführlich", " knapp und präzise", "langsam"),
                correctAnswerIndex = 1
            ),
            QuizData(
                question = "Was bedeutet es, wenn ein Prozess als \"iterativ\" beschrieben wird?",
                options = listOf(
                    "Der Prozess wird einmalig und endgültig durchgeführt.",
                    "Der Prozess wird in wiederholten Schritten oder Zyklen durchgeführt.",
                    " Der Prozess wird in zufälliger Reihenfolge durchgeführt."
                ),
                correctAnswerIndex = 1
            ),
            QuizData(
                question = "Was ist \"Interpolation\" in der Mathematik und Informatik?",
                options = listOf(
                    " Das Hinzufügen neuer Datenpunkte zwischen zwei bekannten Werten",
                    " Das Löschen unnötiger Daten",
                    "Die Multiplikation von zwei Werten"
                ),
                correctAnswerIndex = 0
            ),
            QuizData(
                question = "Was bedeutet das Wort \"arbiträr\"?",
                options = listOf(
                    "mathematisch berechnet",
                    "zufällig oder willkürlich",
                    "in einer festen Reihenfolge"
                ),
                correctAnswerIndex = 1
            ),
            QuizData(
                question = "Was bedeutet das Wort \"ephemeral\"?",
                options = listOf("vergänglich oder kurzlebig", " ewig oder dauerhaft", "komplex"),
                correctAnswerIndex = 0
            ),
            QuizData(
                question = " Was beschreibt das Wort \"dichotom\"?",
                options = listOf(
                    "Eine Dreiteilung eines Ganzen",
                    " Eine Zweiteilung oder Spaltung",
                    "Eine unendliche Teilung"
                ),
                correctAnswerIndex = 1
            ),
        )
    }
}