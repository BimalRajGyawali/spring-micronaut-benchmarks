package com.example.micronautdemoapp.service;

import com.example.micronautdemoapp.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMoviesOfGenre(String genre);
}
