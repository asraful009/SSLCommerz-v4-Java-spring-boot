package com.cyber009.sslcommerz.controller;

import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyber009.sslcommerz.service.TransactionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("utility/api/v1/sslcommerz")
public class PaymentController {

  private final TransactionService transactionService;

  @Autowired
  public PaymentController(TransactionService transactionService) {
    this.transactionService = transactionService;
  }

  @PostMapping(value = "/init")
  public String a(@RequestParam Map<String, String> params) {
    UUID orderId = UUID.randomUUID();
    Float total = Float.valueOf("120");
    for (Map.Entry<String, String> param : params.entrySet()) {
      log.info("{} => {}", param.getKey(), param.getValue());
      if (param.getKey().compareTo("order") == 0) {
        orderId = UUID.fromString(param.getValue());
      }
      // if (param.getKey().compareTo("order") == 0) {
      // total = Float.valueOf(param.getValue());
      // }
    }
    return transactionService.trInit(orderId, total);
  }
}
