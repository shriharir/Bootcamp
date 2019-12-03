package com.bootcamp.excercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void expectTheAreaOfRectangleWithLength2andBreadth3ToBe6() {
        assertEquals(6, new Rectangle(2, 3).area());
    }

    @Test
    public void expectTheAreaOfRectangleWithLength4andBreadth7ToBe28() {
        assertEquals(28, new Rectangle(4, 7).area());
    }

}
