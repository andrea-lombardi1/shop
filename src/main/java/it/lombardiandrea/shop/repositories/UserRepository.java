package it.lombardiandrea.shop.repositories;

import it.lombardiandrea.shop.models.ShoppingCart;
import it.lombardiandrea.shop.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
