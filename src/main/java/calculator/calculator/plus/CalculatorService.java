package calculator.calculator.plus;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
        public String plusNumbers(int num1, int num2) {
            int sum = num1 + num2;
            return num1 + "+" + num2 + "=" + sum;
        }

        public String minusNumbers(int num1, int num2) {
            int difference = num1 - num2;
            return num1 + "-" + num2 + "=" + difference;
        }

        public String multiplyNumbers(int num1, int num2) {
            int result = num1 * num2;
            return num1 + "*" + num2 + "=" + result;
        }

        public String divideNumbers(int num1, int num2) {
            if (num2 == 0) {
                return "На ноль делить нельзя";
            }
            int quotient = num1 / num2;
            return num1 + "/" + num2 + "=" + quotient;
        }
    }


