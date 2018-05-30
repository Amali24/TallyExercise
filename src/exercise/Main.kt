package exercise

fun main(args : Array<String>){
    // Prompt user for input of tally string
    // Format is lowercase letter for point gained by player,
    // uppercase letter for point lost by player
    // Supports up to 5 players
    println("Input tally string: ")
    // WARNING: No validation is performed
    val inputTally = readLine()!!

    // Print input to confirm it was read correctly
    println("You input $inputTally")

    // 5 variables to hold 5 scores, initalized to zero
    var aScore = 0
    var bScore = 0
    var cScore = 0
    var dScore = 0
    var eScore = 0

    // Loop through the input string and increment/decrement scores accordingly
    for (c: Char in inputTally){
        when(c){
            'a' -> aScore++
            'b' -> bScore++
            'c' -> cScore++
            'd' -> dScore++
            'e' -> eScore++

            'A' -> aScore--
            'B' -> bScore--
            'C' -> cScore--
            'D' -> dScore--
            'E' -> eScore--
        }
    }

    // Create an array of the scores
    val scores : Array<Int> = arrayOf(aScore, bScore, cScore, dScore, eScore)
    // And a parallel array of labels
    val scoreLabels : Array<Char> = arrayOf('A','B','C','D','E')

    // Simple bubble sort that sorts scores from highest to lowest
    // Also swaps labels to keep them with their affiliated score
    for (i in scores.indices){
        for (j in scores.indices){
            if (scores[j] < scores[i]){
                val temp = scores[j]
                scores[j] = scores[i]
                scores[i] = temp

                val tempChar = scoreLabels[j]
                scoreLabels[j] = scoreLabels[i]
                scoreLabels[i] = tempChar
            }
        }
    }

    // Print the scores from highest to lowest with labels
    println("Scores:")
    for (i in scores.indices){
        println(scoreLabels[i] + ": " + scores[i])
    }
}