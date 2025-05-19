package it.lombardiandrea.shop.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cartItems")
public class CartItem {

    private Integer id;
    private Product product;
    private Integer quantity;
}
