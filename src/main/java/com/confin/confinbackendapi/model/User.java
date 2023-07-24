package com.confin.confinbackendapi.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String name;
    @Column(unique=true)
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private Set<Income> incomes = new HashSet<>();
    @OneToMany(mappedBy = "user")
    private Set<Expense> expenses = new HashSet<>();
    @OneToMany(mappedBy = "user")
    private Set<UserConfig> usersConfigs = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
