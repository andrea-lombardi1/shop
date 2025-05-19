package it.lombardiandrea.shop.repositories;

import it.lombardiandrea.shop.models.Payment;
import it.lombardiandrea.shop.models.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {
}
