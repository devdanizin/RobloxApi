package com.devdaniel.RobloxGetter.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_roblox")
@Data
public class UserRoblox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
}
