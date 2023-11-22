package test.java;

import main.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void testGetSide() {
        Square square = new Square(3);
        assertEquals(3, square.getSide());
    }

}