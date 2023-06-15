package calculator.calculator.plus;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorServiceParameterizedTest {


    private final CalculatorService calculatorService = new
            CalculatorService();

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15})
    public void addParameterizedTest(int num) {
        Assertions.assertEquals(2 * num,
                calculatorService.add((double) num, (double) num));
    }

    @Test
    public void divideByZeroTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculatorService.divideNumbers(5, 0));
    }





}
