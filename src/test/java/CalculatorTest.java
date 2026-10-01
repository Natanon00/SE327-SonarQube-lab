import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se327.Calculator;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5, calculator.add(2, 3));
    }
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1, calculator.subtract(5, 4));
    }
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(6, calculator.multiply(2, 3));
    }
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2.0, calculator.divide(4, 2), 0.01);
    }
}
