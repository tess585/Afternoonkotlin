import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("Enter marks scored")

    var mark:Int = input.nextInt()
    var result = when(mark){

        in (90 .. 100)->'A'
        in (60 .. 90)-> 'B'
        in (40 .. 60)-> 'C'
        in (20 .. 40)-> 'D'
        in (0 .. 20)-> 'E'

        else-> 'E'
    }

    println("Grade scored is $result")
}