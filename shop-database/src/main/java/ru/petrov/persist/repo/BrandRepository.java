package ru.petrov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.petrov.persist.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
