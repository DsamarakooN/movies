package com.dhanush.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    // inside this class we will write database access methods

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional <Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
    
}
