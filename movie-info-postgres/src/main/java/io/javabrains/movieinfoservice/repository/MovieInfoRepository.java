package io.javabrains.movieinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.movieinfoservice.models.MovieSummary;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieSummary, String> {
}
