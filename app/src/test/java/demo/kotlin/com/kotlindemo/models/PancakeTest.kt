package demo.kotlin.com.kotlindemo.models

import org.junit.Assert
import org.junit.Test

/**
 * Created by sewl on 3/11/16.
 */
class PancakeTest() {

    private var radius: Int = 1

    @Test
    fun test_shouldBeTrue() {
        Assert.assertEquals(Cake(radius).radius, radius)
    }

    @Test
    fun test_shouldHaveTheCorrectTopping() {
        Assert.assertEquals(Pancake(radius).preferredTopping(), "Syrup")
    }
}