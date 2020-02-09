/*
Pseudocode:

Variables: q1 to q5, a1 to a5, score, and userInput

Process:
Initialize the variables, including the questions and answers.
For each question, first print the question.
Next, compare the value the user enters with the correct answer.
If the user is correct, print a notification and add one to their score.
If they're incorrect, print the correct answer.
After all of the questions are complete, print the final score.

 */


fun main() {
    val q1 = "Which hockey team did Wayne Gretzky play for in the ‘80s?"
    val a1 = "Edmonton Oilers"
    val q2 = "What year was the very first model of the iPhone released?"
    val a2 = "2007"
    val q3 = "Who discovered penicillin?"
    val a3 = "Alexander Fleming"
    val q4 = "What part of the atom has no electric charge?"
    val a4 = "Neutron"
    val q5 = "Who was the first woman to win a Nobel Prize (in 1903)?"
    val a5 = "Marie Curie"

    var score = 0


    println(q1)
    var userInput = readLine()!!.toString()
    if(userInput.compareTo(a1,true) == 0)
    {
        score++
        println("Correct!")
    }
    else{
        println("Incorrect, the correct answer was " + a1)
    }

    println(q2)
    userInput = readLine()!!.toString()
    if(userInput.compareTo(a2,true) == 0)
    {
        score++
        println("Correct!")
    }
    else{
        println("Incorrect, the correct answer was " + a2)
    }

    println(q3)
    userInput = readLine()!!.toString()
    if(userInput.compareTo(a3,true) == 0)
    {
        score++
        println("Correct!")
    }
    else{
        println("Incorrect, the correct answer was " + a3)
    }

    println(q4)
    userInput = readLine()!!.toString()
    if(userInput.compareTo(a4,true) == 0)
    {
        score++
        println("Correct!")
    }
    else{
        println("Incorrect, the correct answer was " + a4)
    }

    println(q5)
    userInput = readLine()!!.toString()
    if(userInput.compareTo(a5,true) == 0)
    {
        score++
        println("Correct!")
    }
    else{
        println("Incorrect, the correct answer was " + a5)
    }

    println("You finished the quiz with " + score + "/5 correct.")
}
