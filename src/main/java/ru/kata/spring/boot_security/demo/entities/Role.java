package ru.kata.spring.boot_security.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role")
    private String name;
}
