package com.example.demo.services;

import com.example.demo.services.Purchase;
import com.example.demo.services.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}