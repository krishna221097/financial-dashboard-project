package com.example.financialdashboard.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//controller that responds with a hardcoded JSON string representing the account balance.
@RestController
public class FinancialController {

    @GetMapping("/balances")
    public String getBalances() throws IOException {
        return new String(Files.readAllBytes(Paths.get(new ClassPathResource("static/balances.json").getURI())));
    }
}
