package com.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

  @GetMapping("/loans")
  public String getLoans(String input) {
    return "Sitio: Creditos";
  }

}
