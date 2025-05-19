package it.lombardiandrea.shop.repositories;

import it.lombardiandrea.shop.models.CartItem;
import it.lombardiandrea.shop.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends MongoRepository<CartItem, String> {
}
