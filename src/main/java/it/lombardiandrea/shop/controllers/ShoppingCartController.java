package it.lombardiandrea.shop.controllers;

import it.lombardiandrea.shop.models.ShoppingCart;
import it.lombardiandrea.shop.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartController {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @GetMapping("/cart")
    public List<ShoppingCart> getShoppingCart() {
        return shoppingCartRepository.findAll();
    }

    @GetMapping("/cart/{id}")
    public ShoppingCart getShoppingCartById(@RequestParam String id) {
        return shoppingCartRepository.findById(id).orElse(null);
    }

    @PostMapping("/cart")
    public ShoppingCart createShoppingCart(@RequestParam ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }

}
