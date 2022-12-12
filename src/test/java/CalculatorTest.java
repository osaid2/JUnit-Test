import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calc;

    @BeforeAll
    public static void setUp(){
        calc = new Calculator();
    }

    @Test
    public void add10to5thenResult15() {
        double expected = 15;
        double result =  calc.add(10,5);
        assertEquals(expected,result,0.001);
    }
    @Test
    public void add21to22thenResult43() {
        double expected2 = 43;
        double result2 =  calc.add(21,22);
        assertEquals(expected2,result2,0.001);
    }


    @Test
    public void addIncorrectValueThenThrowException(){
        boolean wasException = false;
        try{
            calc.add("adasa","dadadada");
        }
        catch (Exception e){
            wasException = true;
        }
        assertTrue(wasException);
    }

    @Test
    public void multiplication() {
        double expected = 10;
        double result = calc.multiplication(2,5);
        assertEquals(expected,result,0.001);
        double expected2= 11;
        double result2 = calc.multiplication(2.2,5);
        assertEquals(expected2,result2,0.001);

    }

    @Test
    public void subtract() {
        double expected = 17;
        double result = calc.subtract(10,-7);
        assertEquals(expected,result,0.001);
        double expected2 = 20;
        double result2 = calc.subtract(30,10);
        assertEquals(expected2,result2,0.001);

    }

    @Test
    public void devide() {
        double expected = 5.5;
        double result = calc.devide(11,2);
        assertEquals(expected,result,0.001);
        double expected2 = 19;
        double result2 = calc.devide(38,2);
        assertEquals(expected2,result2,0.001);

    }

    @AfterAll
    public static void close(){
        calc = null;
    }

}