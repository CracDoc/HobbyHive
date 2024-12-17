package org.shineyourhobbies.shineyourhobbies.repository;

import org.shineyourhobbies.shineyourhobbies.model.entities.Hobby;
import org.shineyourhobbies.shineyourhobbies.model.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HobbyRepository extends JpaRepository<Hobby, Long> {

    List<Hobby> findAllByLocation(Location location);

}

