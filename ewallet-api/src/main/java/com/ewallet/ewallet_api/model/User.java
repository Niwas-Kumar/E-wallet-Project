package com.ewallet.ewallet_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private Double balance = 0.0;

    // Constructors
    public User() {}

    public User(String email, String password, String fullName, Double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
    }

}
