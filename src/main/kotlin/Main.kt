import java.util.Scanner
import java.util.Date
import kotlin.math.pow



abstract class Car(val model:String, val color :String, val speed :Int){



abstract fun getFuelType() :String

    }
class BMW(model: String, color: String, speed: Int): Car(model, color, speed) {
    override
fun getFuelType(): String{
    return "gas"
}
}
class Tesla(model: String, color: String, speed: Int): Car(model, color, speed){

    override
    fun getFuelType(): String{
        return "electricity"
    }
}


fun main() {
val car1=BMW("x6","black",120)

    val car2= Tesla("Y","red",140)

    println("the fuel type ${car1.getFuelType()}")
    println("the fuel type ${car2.getFuelType()}")

}
