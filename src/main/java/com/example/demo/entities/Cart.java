package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id", nullable = false)
    private Long id;

    @Column(name = "package_price")
    private BigDecimal package_price;

    @Column(name = "order_tracking_number")
    private String orderTrackingNumber; // Added this line

    @Column(name = "party_size")
    private int party_size;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('pending', 'ordered', 'canceled')")
    private StatusType status;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "cart")
    private Set<CartItem> cart_items;

    public void add(CartItem cartItem) {
        if (cart_items == null) {
            cart_items = new HashSet<>();
        }
        cart_items.add(cartItem);
        cartItem.setCart(this);
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cart_items = cartItems;
        for (CartItem cartItem : cartItems) {
            cartItem.setCart(this);
        }
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber; // Updated this line
    }

    // Add a getter for orderTrackingNumber
    public String getOrderTrackingNumber() {
        return this.orderTrackingNumber;
    }

    public Set<CartItem> getCartItems() {
        return this.cart_items;
    }

    public enum StatusType {
        pending,
        ordered,
        canceled
    }
}
