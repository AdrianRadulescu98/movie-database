package com.example.movies.repositories;

import com.example.movies.entity.Actor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActorRepository extends CrudRepository<Actor, Long> {
}
