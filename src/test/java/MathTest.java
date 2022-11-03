import org.junit.Test;
import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void testAddFunction(){
        assertEquals(10, MathOps.addNumbers(5, 5), 0);
    }
    @Test
    public void testTipCalculator(){
        double cost = 25.50;
        double tip = 15;
        double expected = 3.83;
        assertEquals(expected, MathOps.tipCalculator(cost, tip), 0.05);
    }
    public static void main(String[] args) {
        assertEquals(10, MathOps.addNumbers(5, 5), 0);
    }
}
