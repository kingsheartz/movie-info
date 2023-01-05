package io.javabrains.movieinfoservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.movieinfoservice.models.MovieSummary;
import io.javabrains.movieinfoservice.repository.MovieInfoRepository;

@Service
public class MovieInfoServicesImpl implements MovieInfoServices {

    @Autowired
    private MovieInfoRepository movieInfoRepository;

    /**
     * Method to get Movie info.
     * 
     * @param id
     * @return Optional<MovieSummary>
     */
    @Override
    public Optional<MovieSummary> getMovieInfo(String id) {

        return movieInfoRepository.findById(id);
    }

    /**
     * Method to set Movie info.
     * 
     * @param movieSummary
     */
    @Override
    public void setMovieInfo(MovieSummary movieSummary) {
        movieInfoRepository.save(movieSummary);
    }

}
