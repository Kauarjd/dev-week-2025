package me.dio.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Autenticacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String passHash;

    private String token;

    private Date expireDate;

    // Getters e Setters
}