package com.bootcamp.excercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RectangleTest {

    private final Rectangle rectangle2x3 = new Rectangle(2, 3);
    private final Rectangle rectangle4x7 = new Rectangle(4, 7);
    private final Rectangle rectangle4x5 = new Rectangle(4, 5);
    private final Rectangle rectangle6x8 = new Rectangle(6, 8);

    @Test
    public void expectTheAreaOfRectangleWithLength2andBreadth3ToBe6() {
        assertEquals(6, rectangle2x3.area());
    }

    @Test
    public void expectTheAreaOfRectangleWithLength4andBreadth7ToBe28() {
        assertEquals(28, rectangle4x7.area());
    }

    @Test
    public void expectPerimeterOfRectangleWithLength2andBreadth3ToBe10() {
        assertEquals(10, rectangle2x3.perimeter());
    }

    @Test
    public void expectPerimeterOfRectangleWithLength4andBreadth7ToBe22() {
        assertEquals(22, rectangle4x7.perimeter());
    }

    @Test
    public void expectTwoRectanglesOfEqualLengthAnBreadthToBeEqual() {
        assertEquals(rectangle4x5, new Rectangle(4, 5));
    }

    @Test
    public void expectRectangleWithLength6andBreadth8EqualToItSelf() {
        assertEquals(rectangle6x8, rectangle6x8);
    }

    @Test
    public void expectRectangleWithLength7AndBreadth9UnequalToNull() {
        Rectangle rectangle7x9 = new Rectangle(7, 9);
        assertNotEquals(rectangle7x9, null);
    }

    @Test
    public void expectRectangleShouldNotEqualWithAnyOtherObject() {
        assertNotEquals(new Rectangle(2, 9), new Object());
    }

    @Test
    public void expectRectangleOfLength11Breadth12NotEqualsRectangleLength12Breadth13() {
        assertNotEquals(new Rectangle(11,12), new Rectangle(12,13));
    }
}

