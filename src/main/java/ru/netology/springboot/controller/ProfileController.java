package ru.netology.springboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springboot.profiles.SystemProfile;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ProfileController {
    private SystemProfile profile;

    @GetMapping("profile")
    String getProfile() {
        return profile.getProfile();
    }
}