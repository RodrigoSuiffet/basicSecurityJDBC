package com.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

  @GetMapping("/balance")
  public String get(String input) {
    return "Sitio: Balance";
  }
}
