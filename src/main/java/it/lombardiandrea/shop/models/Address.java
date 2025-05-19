package it.lombardiandrea.shop.models;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private Integer id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
