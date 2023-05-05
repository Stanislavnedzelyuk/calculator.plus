package calculator.calculator.plus;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    private final CalculatorService calculatorService;

    @GetMapping(path = "/calculator")
    public String welcome () {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String plusNumbers (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.plusNumbers(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusNumbers (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.minusNumbers(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyNumbers (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiplyNumbers(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideNumbers (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divideNumbers(num1, num2);

    }

}
