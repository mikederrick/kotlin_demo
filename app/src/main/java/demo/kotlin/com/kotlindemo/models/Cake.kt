package demo.kotlin.com.kotlindemo.models

/**
 * Created by sewl on 3/11/16.
 */
open class Cake(var radius: Int) {

    open fun preferredTopping() : String {
        return "Icing"
    }

    fun bake() {
    }
}

