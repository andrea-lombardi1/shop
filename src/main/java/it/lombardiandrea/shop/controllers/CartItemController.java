package it.lombardiandrea.shop.controllers;

import it.lombardiandrea.shop.models.CartItem;
import it.lombardiandrea.shop.repositories.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartItemController {

    @Autowired
    private CartItemRepository cartItemRepository;

    @GetMapping("/cart-items")
    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    @GetMapping("/cart-items/{id}")
    public CartItem getCartItemById(@PathVariable String id) {
        return cartItemRepository.findById(id).orElse(null);
    }

    @PostMapping("/cart-items")
    public CartItem createCartItem(@RequestBody CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }
}
