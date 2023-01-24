package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/math")
    public String welcomeMathMsg(){
        return "Welcome to the math controller!";
    }

    @GetMapping("/math/division-info")
    public ArithmeticOperation divisionInfo(){
        ArithmeticOperation division = new ArithmeticOperation();
        division.setName("division");
        division.setMinNumberOfOperands(2);
        division.setDescription("Perform a division, ex: num - num = sum");
        division.setProperties(new String[]{"This operation divide two numbers using the symbol '/'.", "Is the inverse operation of a multiplication.", "Distributive", "Invariant"});
        return division;
    }

    @GetMapping("/math/multiplication")
    public Integer multiplication(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/math/square/{n}")
    public Integer square(@PathVariable int n) {
        return n * n;
    }
}