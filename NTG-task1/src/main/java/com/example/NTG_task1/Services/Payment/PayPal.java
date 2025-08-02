package com.example.NTG_task1.Services.Payment;

import org.springframework.stereotype.Component;

@Component("PayPal")
public class PayPal implements payments{
    @Override
    public String Payment(String accountNumber) {
        return "Customer No: "+accountNumber +" will pay with --> PayPal";
    }
}
