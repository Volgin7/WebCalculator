package pro.sky.webcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;

    }
    @GetMapping("/calculator")
    public String hello() {
        return calculatorService.hello();
    }
    @GetMapping("/calculator/plus")
    public String sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.sum(num1, num2);
    }
    @GetMapping("/calculator/minus")
    public String sub(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.sub(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String mult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.mult(num1, num2);
    }
        @GetMapping("/calculator/divide")
        public String div(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            return calculatorService.div(num1, num2);
        }

}
