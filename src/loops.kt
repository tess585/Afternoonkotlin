fun main() {
    //While loop
    var number = 20
    while (number <= 25) {
        println("Number is $number")
        number++
    }
    //Decrement
    var num = 100
    while (num >= 95) {
        println("counter is $num")
        num--
    }
    //Do...while loop
    var x = 34
    do {
        println(x)
        x++
    } while (x <= 40)

    //For loop
    var devices = arrayOf("laptop", "phone", "tablet")
    for (device in devices) {
        println("Device is $device")
    }
    //Array Marks
    var marks = arrayOf(40, 45, 54, 97)
    for (mark in marks) {
        println("scored a $mark")
    }
    for (mynumber in 50..60) {
        println(mynumber)
    }
    for (letters in 'A'..'D') {
        println(letters)
    }
}