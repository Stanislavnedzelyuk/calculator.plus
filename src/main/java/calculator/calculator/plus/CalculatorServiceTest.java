package calculator.calculator.plus;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void addTest() {
        assertEquals(Optional.of(10), calculatorService.add(5.0, 5.0));
        assertEquals(Optional.of(0), calculatorService.add(5.0, -5.0));
        assertEquals(Optional.of(-10), calculatorService.add(-5.0, -5.0));
        assertEquals(Optional.of(0), calculatorService.add(0.0, 0.0));
        assertEquals(Optional.of(5), calculatorService.add(0.0, 5.0));
        assertEquals(Optional.of(-5), calculatorService.add(0.0, -5.0));


    }
}
