fun main() {
    val marks: Double = 101.0

    if (marks <30 ){
        println("You Scored $marks")
        println("Failed")
    } else if (marks >= 30 && marks <= 50) {
        println("You Scored $marks")
        println("You have Below Average")
    } else if (marks > 50 && marks <= 70) {
        println("You have $marks")
        println("You have an Average")
    } else if (marks > 70 && marks <= 100) {
        println("You Scored $marks")
        println("Above Average")
    } else {
        println("Invalid")
    }
    
}
//End Main Function