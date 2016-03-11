package demo.kotlin.com.kotlindemo.models

/**
 * Created by sewl on 3/11/16.
 */
class Pancake(radius: Int) : Cake(radius) {

    override fun preferredTopping(): String {
        return "Syrup"
    }
}
