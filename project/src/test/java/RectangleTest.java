package test.java;

import main.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(2, 5);
        assertEquals(10, rectangle.computeArea());
    }
    @Test
    public void testGetHeight() {
        Rectangle rectangle = new Rectangle(2, 5);
        assertEquals(2, rectangle.getHeight());
    }

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(2, 5);
        assertEquals(5, rectangle.getWidth());
    }

    @Test
    public void testSetHeight() {
        Rectangle rectangle = new Rectangle(2, 5);
        rectangle.setHeight(3);
        assertEquals(3, rectangle.getHeight());
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(2, 5);
        rectangle.setWidth(3);
        assertEquals(3, rectangle.getWidth());
    }
}
