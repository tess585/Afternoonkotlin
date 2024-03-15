class dog(var name:String,var breed:String,var weight:Int){
    fun move(movement:String){
        println("The dog is $movement")
    }
}

fun main() {
    var dog1 = dog("Murife","pitbull",45)
    var dog2 = dog("Bob","Bulldog",35)

    println(dog1.breed)
    dog2.move("running")
    dog1.move("walking")

}