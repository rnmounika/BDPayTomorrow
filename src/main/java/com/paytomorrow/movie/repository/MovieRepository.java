package com.paytomorrow.movie.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paytomorrow.movie.entiity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
    
}
