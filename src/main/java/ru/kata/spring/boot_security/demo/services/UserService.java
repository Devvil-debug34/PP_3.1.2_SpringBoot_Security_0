package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void add(User user);

    void update(int id, User user);

    void delete(int id);

    List<User> findAll();

    User findById(int id);

    Optional<User> findByEmail(String email);
}
