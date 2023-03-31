package com.example.springdemoapp.service;

import com.example.springdemoapp.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMoviesOfGenre(String genre);
}
