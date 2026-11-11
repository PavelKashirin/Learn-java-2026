package org.example.controller;

import org.example.service.CalculateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Kashirin Pavel
 */
@RestController
@RequestMapping("api/root/math")
public class MathController {

    private final CalculateService calculateService = new CalculateService();

    @GetMapping("sum")
    public ResponseEntity<String> sum(
            @RequestParam double a,
            @RequestParam double b
    ) {

        String result = calculateService.sumArguments(a, b);

        return ResponseEntity.ok(result);
    }

    @GetMapping("subtraction")
    public ResponseEntity<String> subtraction(
            @RequestParam double a,
            @RequestParam double b
    ) {

        String result = calculateService.subtractionArguments(a, b);

        return ResponseEntity.ok(result);
    }

    @GetMapping("multiplication")
    public ResponseEntity<String> multiplication(
            @RequestParam double a,
            @RequestParam double b
    ) {

        String result = calculateService.multiplicationArguments(a, b);

        return ResponseEntity.ok(result);
    }

    @GetMapping("div")
    public ResponseEntity<String> div(
            @RequestParam double a,
            @RequestParam double b
    ) {

        String result = calculateService.divArguments(a, b);

        return ResponseEntity.ok(result);
    }
}
