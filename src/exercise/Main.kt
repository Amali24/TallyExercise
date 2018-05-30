package exercise

fun main(args : Array<String>){
    println("Input tally string: ")
    val inputTally = readLine()!!

    println("You input $inputTally")

    var aScore = 0
    var bScore = 0
    var cScore = 0
    var dScore = 0
    var eScore = 0

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

    var scores : Array<Int> = arrayOf(aScore, bScore, cScore, dScore, eScore)
    var scoreLabels : Array<Char> = arrayOf('A','B','C','D','E')

    for (i in scores.indices){
        for (j in scores.indices){
            if (scores[j] < scores[i]){
                var temp = scores[j]
                scores[j] = scores[i]
                scores[i] = temp

                var tempChar = scoreLabels[j]
                scoreLabels[j] = scoreLabels[i]
                scoreLabels[i] = tempChar
            }
        }
    }

    println("Scores:")
    for (i in scores.indices){
        println(scoreLabels[i] + ": " + scores[i])
    }
}