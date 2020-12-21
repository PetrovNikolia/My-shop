package ru.petrov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.petrov.persist.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
