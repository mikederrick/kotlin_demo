package demo.kotlin.com.kotlindemo.models

import demo.kotlin.com.kotlindemo.models.Cake
import org.junit.Assert
import org.junit.Test

/**
 * Created by sewl on 3/11/16.
 */
class CakeTest() {

    @Test
    fun test_shouldBeTrue() {
        var radius = 1

        Assert.assertEquals(Cake(radius).radius, radius)
    }
}
