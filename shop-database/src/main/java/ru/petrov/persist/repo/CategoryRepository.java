package ru.petrov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.petrov.persist.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
