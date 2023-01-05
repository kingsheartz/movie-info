package com.movie.aws.springcloudawslambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.movie.aws.springcloudawslambda.entity.Movie;
import com.movie.aws.springcloudawslambda.repository.MovieRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringCloudAwsLambdaApplication {

	@Autowired
	private MovieRepository movieRepository;

	@Bean
	public Supplier<List<Movie>> movies(){
		return ()->movieRepository.movieList();
	}

	@Bean
	public Function<String, List<Movie>> findByName(){
		return (input)->movieRepository.movieList().stream().
				filter(movie -> movie.getName().equals(input)).collect(Collectors.toList());
	}

	@Bean
	public MyConsumer myConsumerBean(){
		return new MyConsumer();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAwsLambdaApplication.class, args);
	}
}
