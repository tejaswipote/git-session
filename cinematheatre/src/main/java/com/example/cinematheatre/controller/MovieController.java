package com.example.cinematheatre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cinematheatre.model.Movie;
import com.example.cinematheatre.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/allmovies")
	public List<Movie> findAllMovies() {
		return (List<Movie>) movieService.getAllMovies();
	}

	@GetMapping("/movies/{movie_id}")
	public ResponseEntity<?> getMovieById(@PathVariable Long movie_id) {
		Movie movie = movieService.getMovieById(movie_id);
		return ResponseEntity.status(HttpStatus.OK).body(movie);
	}

}