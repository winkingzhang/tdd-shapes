package tdd.shapes

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


class ShapeTest {
    private val shape = Shape()
    @Test
    fun areaThrowsNotImplementedException() {
        assertThrows(UnsupportedOperationException::class.java) { shape.area() }
    }

    @Test
    fun perimeterThrowsNotImplementedException() {
        assertThrows(UnsupportedOperationException::class.java) { shape.perimeter() }
    }
}
