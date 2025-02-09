fun main() {
    val age = 9
    //If condition
    if (age < 10){
        println("You're too young to watch this movie")
    }

    //Else if Condition
    else if(age < 13){
        println("You can watch this movie with a parent")
    }

    //Else-> Last Option when all conditions are false, this will execute
    else {
        println("You can watch this Movie")
    }
    
}