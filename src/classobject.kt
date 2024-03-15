class Person{
    //Attribute/Properties
    var name = "Tracy"
    var age = 21
    var gender = "Female"

    //Behaviour/Method
    fun walk(){
        println("person is walking")
    }

}

fun main() {
    var doctor = Person()
    println(doctor.name)

    doctor.walk()
}