package ru.petrov.service;

import ru.petrov.controller.rep.ProductRepr;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductRepr> findAll();

    Optional<ProductRepr> findById(Long id);

}
