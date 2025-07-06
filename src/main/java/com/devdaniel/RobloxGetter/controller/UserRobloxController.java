package com.devdaniel.RobloxGetter.controller;

import com.devdaniel.RobloxGetter.model.UserRoblox;
import com.devdaniel.RobloxGetter.repository.UserRobloxRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class UserRobloxController {

    private final UserRobloxRepository repository;

    @GetMapping
    public List<UserRoblox> getAll() {
        List<UserRoblox> all = repository.findAll();
        System.out.println("Usuários encontrados: " + all.size());
        return all;
    }

    @PostMapping
    public void create(@RequestBody UserRoblox user) {
        repository.save(user);
    }

}
