fun main() {
println(peopleHeight.count()
    println(peopleHeight.sumOf { ("1.65,1.5,1.63,1.7,1.68") }

  (name(listOf("computer","mary","monitor","Tanya","Keyboard","Jane","Laptop","Lisa","Mouse","Lona"))

}
    fun name(names:List<String>):List<String>{
    names.forEachIndexed { names, z ->
 if (names%2==0) {
     println(z)
 }
    return z
    }

}
fun h(height:List<double>): String{
    var heightTotal=height.sum()
    var avgheight=height.avg()

}
    data class Human(var name: String, var age: Int, var height: Int, var weight: Int){
        var Human =
            listOf(
                Human("Jane", 15, 120, 35),
                Human("Stella", 18, 147, 40),
                Human("Mercy", 17, 150, 53),
                Human("Mary", 25, 162, 52)
            )
        var sortedHuman = Human.sortedBy { human -> human.name }
        var descendingSortedHuman = Human.sortedByDescending { human -> human.age }
    }

}



data class Car(var registration: Int, var mileage: Int)
var Vehicle= listOf(
    Car(13231,12000),
    Car(12785,15000),
    Car(15987,16000)
)



