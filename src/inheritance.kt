//Parent class/Base class/Super class
open class Animal{
    var age = 3
    var gender = "Female"

    open fun move(movement:String){
        println("Animal is $movement")
    }
}
//Chile class
open class Duck:Animal(){
    var color = "white"
    fun sound(){
        println("The duck is quacking")

    }
}
class fish:Duck(){
    var hasscales = true
    var hasfins = true
    fun eat(){
        println("The fish is eating")

    }
}

fun main() {
    var elephant = Animal()

    var duckling = Duck()
    duckling.move("swimming")
    var nileparch = fish()
}

