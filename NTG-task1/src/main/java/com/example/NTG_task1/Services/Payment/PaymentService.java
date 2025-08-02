package com.example.NTG_task1.Services.Payment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private ApplicationContext context ;


    public String payment(String paymentMethod, String accountNumber) {

        payments payment = (payments) context.getBean(paymentMethod);
        return payment.Payment(accountNumber);
    }
}
