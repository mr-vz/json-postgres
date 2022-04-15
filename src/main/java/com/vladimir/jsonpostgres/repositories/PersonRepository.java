package com.vladimir.jsonpostgres.repositories;

import com.vladimir.jsonpostgres.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
