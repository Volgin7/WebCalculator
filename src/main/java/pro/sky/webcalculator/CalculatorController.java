package pro.sky.webcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;

    }
    @GetMapping()
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.valueOf(num1) +
                " + " + String.valueOf(num2) +
                " = " + String.valueOf(calculatorService.sum(num1, num2));
    }
    @GetMapping("/minus")
    public String sub(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.valueOf(num1) +
                " - " + String.valueOf(num2) +
                " = " + String.valueOf(calculatorService.sub(num1, num2));
    }

    @GetMapping("/multiply")
    public String mult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.valueOf(num1) +
                " * " + String.valueOf(num2) +
                " = " + String.valueOf(calculatorService.mult(num1, num2));
    }
    @GetMapping("/divide")
    public String div(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if(num2 == 0) {
            return "Ошибка: делить на 0 нельзя";
        } else {
            return String.valueOf(num1) +
                    " / " + String.valueOf(num2) +
                    " = " + String.valueOf(calculatorService.div(num1, num2));
        }

    }

}
