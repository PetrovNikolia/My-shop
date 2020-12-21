package ru.petrov.persist.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.petrov.persist.model.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
