
package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSystemTest {
     @Test
    void testFullScenario() {
        Calculator calc = new Calculator();

        int a = 20;
        int b = 4;

        int sum = calc.add(a, b);
        int sub = calc.subtract(a, b);
        int mul = calc.multiply(a, b);
        double div = calc.divide(a, b);

        assertAll("Verifica todas as operações",
            () -> assertEquals(24, sum, "Soma deve ser 24"),
            () -> assertEquals(16, sub, "Subtração deve ser 16"),
            () -> assertEquals(80, mul, "Multiplicação deve ser 80"),
            () -> assertEquals(5.0, div, "Divisão deve ser 5.0")
        );
    }
}
