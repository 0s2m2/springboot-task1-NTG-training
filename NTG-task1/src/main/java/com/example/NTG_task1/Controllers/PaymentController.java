package com.example.NTG_task1.Controllers;

import com.example.NTG_task1.Services.Payment.PaymentService;
import com.example.NTG_task1.Services.Payment.payments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {



    @Autowired
    PaymentService paymentService;

    @PostMapping
    String payment(@RequestParam String payment, @RequestParam String accountNumber) {
        return paymentService.payment(payment, accountNumber);
    }



}
