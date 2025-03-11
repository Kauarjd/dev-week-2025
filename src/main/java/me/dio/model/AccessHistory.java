package me.dio.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class AccessHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date dateTime;

    // Getters e Setters
}