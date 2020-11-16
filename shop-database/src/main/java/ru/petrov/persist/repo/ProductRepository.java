package ru.petrov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.petrov.persist.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
