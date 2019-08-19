package com.example.cinematheatre.service;

import java.util.List;

import com.example.cinematheatre.model.Movie;
import com.example.cinematheatre.repositary.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

      public  List<Movie> getAllMovies()
        {
            return movieRepository.findAll();

        }

        public Movie getMovieById(Long movieId){
          return movieRepository.findById(movieId).get();
        }

}
