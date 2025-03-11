package me.dio.model;

import jakarta.persistence.*;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String address;

    private boolean main;

    private boolean bureau;

    // Getters e Setters
}