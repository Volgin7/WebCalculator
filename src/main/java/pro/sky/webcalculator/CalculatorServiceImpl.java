package pro.sky.webcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор 3";
    }

    public String sum(int num1, int num2) {
        return String.valueOf(num1) +
                " + " + String.valueOf(num2) +
                " = " + String.valueOf(num1 + num2);
    }
    public String sub(int num1, int num2) {
        return String.valueOf(num1) +
                " - " + String.valueOf(num2) +
                " = " + String.valueOf(num1 - num2);
    }

    public String mult(int num1, int num2) {
        return String.valueOf(num1) +
                " * " + String.valueOf(num2) +
                " = " + String.valueOf(num1 * num2);
    }

    public String div(int num1, int num2) {
        if(num2 != 0) {
            return String.valueOf(num1) +
                    " / " + String.valueOf(num2) +
                    " = " + String.valueOf(num1 / num2);
        }
        else {
            return "Ошибка: делить на 0 нельзя";
        }

    }

}
