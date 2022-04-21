package com.example.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        value = "fraud"
)
public interface FraudClient {

    @GetMapping(path = "api/fraud-check/{customerId}")
    FraudCheckResponse isFraudster(@PathVariable Integer customerId);
}
