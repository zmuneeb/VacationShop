package com.example.demo.services;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class PurchaseResponse {
    @NonNull
    private final String orderTrackingNumber;

    public PurchaseResponse(@NonNull String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }
}
