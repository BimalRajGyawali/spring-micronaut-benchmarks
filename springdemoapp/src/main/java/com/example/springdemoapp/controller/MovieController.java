package com.example.springdemoapp.controller;

import com.example.springdemoapp.dto.MovieData;
import com.example.springdemoapp.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final static Logger logger = LoggerFactory.getLogger(MovieController.class);

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieData> getAllMoviesOfGenre(@RequestParam String genre){
        logger.info("Request received {}", genre);
        return movieService.findAllMoviesOfGenre(genre).stream()
                .map(movie -> new MovieData(movie.getTitle(), movie.getGenre(), movie.getImdbRating()))
                .toList();
    }
}
