import org.w3c.dom.ranges.Range

fun main() {
myOddNumbers( )
println( namees(arrayOf("lucia","faith","maryanne","lucyanne","loice","linnet","ashley")))
    drinksRobot(6)
    divisble()

}
fun myOddNumbers() {
    var num = 0

    for (num in 1..100)
        if (num % 2 != 0) {

            println(num)
        }
}

fun namees(allNames:Array<String>):Int{
 var nameS=0
    for (nam in allNames)
   if (nam.length>5){
       nameS++
   }
    return nameS

    }





fun drinksRobot(guestsAge:Int) {
    when (guestsAge) {
        in 0..5 -> println(" milk")
        in 6..14 -> println("fanta orange")
        else -> println("coca cola")
    }

}


fun divisble() {

 for (divide in 1..100)

     if (divide%3==0 && divide%5==0){
         println("FizzBuzz")
     }
    else if (divide%3==0){
        println("Fizz")
     }
    else if (divide%5==0){
        println("Buzz")

     }
}








