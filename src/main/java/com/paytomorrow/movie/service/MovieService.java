package com.paytomorrow.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paytomorrow.movie.entiity.Movie;
import com.paytomorrow.movie.repository.MovieRepository;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getMoviesList() {
        return (List<Movie>) movieRepository.findAll();
    }

    public Movie updateMovie(Movie movie, Integer movieId) {
        Movie newMovie = movieRepository.findById(movieId).get();
        newMovie.setId(movieId);
        newMovie.setTitle(movie.getTitle());
        newMovie.setDirector(movie.getDirector());
    
        return movieRepository.save(newMovie);
    }

    public void deleteMovie(Integer movieId) {
        movieRepository.deleteById(movieId);
    }
}
