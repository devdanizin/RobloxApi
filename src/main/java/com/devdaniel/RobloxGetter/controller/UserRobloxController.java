package com.devdaniel.RobloxGetter.controller;

import com.devdaniel.RobloxGetter.model.UserRoblox;
import com.devdaniel.RobloxGetter.repository.UserRobloxRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/v1")
@RequiredArgsConstructor
public class UserRobloxController {

    private final UserRobloxRepository repository;

    @GetMapping
    public List<UserRoblox> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(UserRoblox user) {
        repository.save(user);
    }

}
