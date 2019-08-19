package com.example.cinematheatre.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cinematheatre.model.Movie;
import org.springframework.stereotype.Repository;

@Repository
	public interface MovieRepository extends JpaRepository<Movie, Long> {
	}


