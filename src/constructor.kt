import kotlin.concurrent.timerTask

class employee(var firstname:String, var age:Int, var gender:String, var position:String, var salary:Double){

    fun role(task:String){
        println("The role is $task ")
    }
}

fun main() {
    var employee1 = employee("Faith", 21, "Female", "Managing", 200000.00)
    var employee2 = employee("Ken", 31, "male", "Managing director", 300000.00)

    println(employee1.firstname)
    println("employee1 is ${employee1.age} years old")
}
