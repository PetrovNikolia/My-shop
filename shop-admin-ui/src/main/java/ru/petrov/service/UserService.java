package ru.petrov.service;

import ru.petrov.controller.rep.UserRepr;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(UserRepr userRepr);

    List<UserRepr> findAll();

    Optional<UserRepr> findById(Long id);

    void delete(Long id);
}