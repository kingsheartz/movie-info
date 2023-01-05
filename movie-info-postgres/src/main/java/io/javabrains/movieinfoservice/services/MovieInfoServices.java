package io.javabrains.movieinfoservice.services;

import java.util.Optional;

import io.javabrains.movieinfoservice.models.MovieSummary;

public interface MovieInfoServices {

    /**
     * Method to get Movie info.
     * 
     * @param id
     * @return Optional<MovieSummary>
     */
    public Optional<MovieSummary> getMovieInfo(String id);

    /**
     * Method to set Movie info.
     * 
     * @param movieSummary
     */
    public void setMovieInfo(MovieSummary movieSummary);
}
