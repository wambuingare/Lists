fun main() {

  name(listOf("computer","mary","monitor","Tanya","Keyboard","Jane","Laptop","Lisa","Mouse","Lona"))
    var y=heights(listOf(2.0,67.4,7.5,67.3,23.0))
    println(y)
    var b=Human("mary",18,126.8,42.5)
    var c=Human("Becky",17,134.2,48.3)
    var d=Human("Lyne",20,131.2,50.1)
    var list= listOf(b,c,d)
    var w=list.sortedBy {Human->Human.age }
    println(w)
    var e=Human("Wanda",21,155.6,54.3)
    var f=Human("Laura",22,145.8,54.9)
    var lists= listOf(e,f)
    var z=list.sortedBy { Human->Human.age }
    println(z)
 var x=Cars("12290",60)
    var v=Cars("Honda",109)
    var listss= listOf(x,v)
var t=listss.sortedBy { Cars->Cars.mileage }
    println(t)

}
    fun name(names:List<String>):List<String>{
    names.forEachIndexed { names, z ->
        if (names % 2 == 0) {
            println(z)
        }
    }
    return names


}
fun heights(height:List<Double>): String{
    var heightTotal=height.sum()
    var avgheight=height.average()
    var ppl=("$heightTotal $avgheight")
    return ppl

}
    data class Human(var name: String, var age: Int, var height: Double, var weight: Double) {
    }
fun add (name:List<Any>):List<Any>{
    return listOf()
}

data class Cars(var registration: String, var mileage: Int)
fun motorVehicle(car:List<Cars>):Int {
    var motorVehicle = 0
    car.forEach { cars ->
        cars.mileage
    }
    var total = motorVehicle / car.count()
    return total
}





