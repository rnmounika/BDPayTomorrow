package com.paytomorrow.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.paytomorrow.movie.entiity.Movie;
import com.paytomorrow.movie.service.MovieService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController {
 
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> fetchDepartmentList() {
        return movieService.getMoviesList();
    }

    @PostMapping("/movies")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @PutMapping("/movies/{id}")
    public Movie updateDepartment(@RequestBody Movie movie, @PathVariable("id") Integer movieId) {
        return movieService.updateMovie(movie, movieId);
    }

    @DeleteMapping("/movies/{id}")
    public String deleteMovie(@PathVariable("id") Integer movieId) {
        movieService.deleteMovie(movieId);
        return "Deleted Successfully";
    }
}
