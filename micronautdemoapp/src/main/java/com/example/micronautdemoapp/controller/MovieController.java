package com.example.micronautdemoapp.controller;


import com.example.micronautdemoapp.dto.MovieData;
import com.example.micronautdemoapp.service.MovieService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller("/movies")
public class MovieController {

    private final static Logger logger = LoggerFactory.getLogger(MovieController.class);

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @Get
    public List<MovieData> getAllMoviesOfGenre(@QueryValue String genre){
        logger.info("Request received {}", genre);

        return movieService.findAllMoviesOfGenre(genre).stream()
                .map(movie -> new MovieData(movie.getTitle(), movie.getGenre(), movie.getImdbRating()))
                .toList();
    }
}
