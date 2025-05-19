package it.lombardiandrea.shop.repositories;

import it.lombardiandrea.shop.models.CartItem;
import it.lombardiandrea.shop.models.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {
}
