package it.lombardiandrea.shop.controllers;

import it.lombardiandrea.shop.models.Payment;
import it.lombardiandrea.shop.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/payments")
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @GetMapping("/payments/{id}")
    public Payment getPaymentById(@PathVariable String id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @PostMapping("/payments")
    public Payment createPayment(@PathVariable Payment payment) {
        return paymentRepository.save(payment);
    }
}
