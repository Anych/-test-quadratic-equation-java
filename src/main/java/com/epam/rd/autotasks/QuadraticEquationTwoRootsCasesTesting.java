package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private String expected;
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 5, 4, "-4.0 -1.0"},
                {2, 6, 1.375, "-2.75 -0.25"},
                {1.625, 7, 2, "-4.0 -0.3076923076923077"},
                {4, 8, 1.75, "-1.75 -0.25"},
        });
    }
    @Test
    public void testNoRootsCase() {
        assertEquals(expected, quadraticEquation.solve(a, b, c));
    }

}
