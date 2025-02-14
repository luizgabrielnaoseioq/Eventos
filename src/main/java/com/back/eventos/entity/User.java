package com.back.eventos.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Column(unique = true)
    private String cpf;

    @Column(name = "birth_date")
    private Date birthDate;

    private String perfil;

    private Boolean isVerified;

    public User(String name, String email, String password, String cpf, Date birthDate, String perfil, Boolean isVerified) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.perfil = perfil;
        this.isVerified = isVerified;
    }

    public User() {}

    public static JsonSubTypes.Type builder() {
        return null;
    }
}
