package pro.sky.webcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebCalculatorApplication {

    public static void main(String[] args) {
        System.out.println("Hello Spring");
        SpringApplication.run(WebCalculatorApplication.class, args);
    }

}
