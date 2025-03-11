package me.dio.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String cpf;

    @NotNull
    private Date birthDate;

    @NotNull
    private Date registerDate;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Autenticacao autenticacao;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Email> emails;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Address> addresses;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<AccessHistory> accessHistories;

    // Getters e Setters
}