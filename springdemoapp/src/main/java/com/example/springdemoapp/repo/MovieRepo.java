package com.example.springdemoapp.repo;

import com.example.springdemoapp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

    List<Movie> findAllByGenre(String genre);
}
