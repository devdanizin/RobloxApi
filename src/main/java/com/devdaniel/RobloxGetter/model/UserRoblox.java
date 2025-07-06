package com.devdaniel.RobloxGetter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_roblox")
public class UserRoblox {
    @Id
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
}
