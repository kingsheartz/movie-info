package io.javabrains.movieinfoservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.movieinfoservice.models.Movie;
import io.javabrains.movieinfoservice.models.MovieSummary;
import io.javabrains.movieinfoservice.services.MovieInfoServices;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieInfoServices movieInfoServices;

    @Value("${api.key}")
    private String apiKey;

    @PostMapping("/movie")
    public void setMovieInfo(@RequestBody MovieSummary movieSummary) {
        movieInfoServices.setMovieInfo(movieSummary);
    }

    @GetMapping("/movie/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        Optional<MovieSummary> movieSummary = movieInfoServices.getMovieInfo(movieId);
        return movieSummary != null ? new Movie(movieId, movieSummary.get().getTitle(), movieSummary.get().getOverview()) : null;
    }
}
