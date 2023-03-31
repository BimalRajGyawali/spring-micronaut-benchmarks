package com.example.micronautdemoapp.repo;


import com.example.micronautdemoapp.model.Movie;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

    List<Movie> findAllByGenre(String genre);
}
