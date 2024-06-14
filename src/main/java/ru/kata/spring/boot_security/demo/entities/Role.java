package ru.kata.spring.boot_security.demo.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name")
    private String name;

    @ManyToMany(mappedBy = "all_roles")
    private Collection<User> all_users;

    public Role() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<User> getAll_users() {
        return all_users;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAll_users(Collection<User> all_users) {
        this.all_users = all_users;
    }
}
