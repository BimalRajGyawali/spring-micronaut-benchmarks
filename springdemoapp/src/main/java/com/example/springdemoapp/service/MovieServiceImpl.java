package com.example.springdemoapp.service;

import com.example.springdemoapp.model.Movie;
import com.example.springdemoapp.repo.MovieRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
