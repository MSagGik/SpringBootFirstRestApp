package ru.msaggik.spring.SpringBootFirstRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.msaggik.spring.SpringBootFirstRestApp.model.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
