package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final List<User> users = new ArrayList<>();

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/register")
    public Map<String, Object> register(@RequestBody User user) {
        users.add(user);
        return Map.of("message", "Пользователь зарегистрирован: " + user.getUsername(),
                "user", user);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/{username}")
    public ResponseEntity<?> deleteUser(@PathVariable String username) {
        Optional<User> userToRemove = users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();

        if (userToRemove.isPresent()) {
            users.remove(userToRemove.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
