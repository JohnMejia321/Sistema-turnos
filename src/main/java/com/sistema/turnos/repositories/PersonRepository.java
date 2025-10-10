package com.sistema.turnos.repositories;

import java.util.Optional;

import com.sistema.turnos.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByDni(String dni);

}