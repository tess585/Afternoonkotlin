fun main() {
    println("Enter the marks:")
    val mark = readLine()!!.toInt()

    val grade = when (mark){
        in 90..100 ->"A"
        in 80..89 ->"B"
        in 70..79 ->'C'
        in 60..69 ->'D'
        in 0..59 ->'E'
        else -> "Invalid Mark"
    }
    println("Grade:$grade")
}