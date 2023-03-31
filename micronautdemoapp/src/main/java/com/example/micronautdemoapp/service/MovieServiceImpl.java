package com.example.micronautdemoapp.service;



import com.example.micronautdemoapp.model.Movie;
import com.example.micronautdemoapp.repo.MovieRepo;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class MovieServiceImpl implements MovieService{

    private final MovieRepo movieRepo;

    public MovieServiceImpl(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    @Override
    public List<Movie> findAllMoviesOfGenre(String genre) {
        return movieRepo.findAllByGenre(genre);
    }
}
