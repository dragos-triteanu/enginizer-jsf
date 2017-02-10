package com.enginizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enginizer.entities.Person;

/**
 * JPA repository for {@link Person persons}.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
