package com.example.aws.springcloudawslambda.repository;

import com.example.aws.springcloudawslambda.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class MovieRepository {

    public List<Movie> movieList() {
        return Arrays.asList(
                new Movie(1, "Tom & Jerry", "Animation"),
                new Movie(2, "John wick", "Action"),
                new Movie(3, "Rio", "Adventure"));
    }
}
