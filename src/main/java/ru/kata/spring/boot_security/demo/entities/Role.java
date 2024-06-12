package ru.kata.spring.boot_security.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name")
    private String name;

    @ManyToMany(mappedBy = "all_roles")
    private Set<User> all_users;
}
