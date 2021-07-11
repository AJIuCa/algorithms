package lesson5;

import static org.junit.jupiter.api.Assertions.*;

class MathPowTest {

    @org.junit.jupiter.api.Test
    void pow() {
        double a = 2;
        double b = 10;
        double expResult = 1024;
        double result = new MathPow().Pow(a,b);
        assertEquals(expResult,result);
    }

    @org.junit.jupiter.api.Test
    void recPow() {
        double a = 2;
        double b = -3;
        double expResult = 0.125;
        double result = new MathPow().recPow(a,b);
        assertEquals(expResult,result);
    }
}