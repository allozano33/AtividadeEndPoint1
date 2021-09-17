package com.example.atividadeendpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromoEndPoint {

    @GetMapping("/palindromo")
    public String palindromo (@RequestParam String nome) {
        String palindromo = "";
        for (int i = nome.length() - 1; i >= 0; i--) {
            palindromo += nome.charAt(i);
        }
        if (palindromo.equals(nome)) {
            return "É um palíndromo!" + "\n" + palindromo.toUpperCase();
        } else {
            return "Não é um palíndromo!" + "\n" + palindromo.toUpperCase();
        }
    }
}