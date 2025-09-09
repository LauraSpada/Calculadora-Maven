
package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorIntegrationTest {
     @Test
    void testUIAndCalculatorIntegration() {
        Calculator calc = new Calculator();
        
        int sum = calc.add(5, 3);
        int sub = calc.subtract(5, 3);
        int mul = calc.multiply(5, 3);
        double div = calc.divide(6, 3);

        assertEquals(8, sum, "Soma deve ser 8");
        assertEquals(2, sub, "Subtração deve ser 2");
        assertEquals(15, mul, "Multiplicação deve ser 15");
        assertEquals(2.0, div, "Divisão deve ser 2.0");
    }
}
