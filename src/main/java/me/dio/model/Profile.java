package me.dio.model;

import jakarta.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ProfileType type;

    public enum ProfileType {
        ADMIN, USER, GUEST
    }

    // Getters e Setters
}