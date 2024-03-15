fun main() {
    var language = arrayOf("kotlin", "Python","Javascript","PHP")
    println(language[1])

    //Reassigning a value
    language[1]= "c++"
    println(language[1])

    //Accessing elements
    for (x in language){
        println(x)
    }
}