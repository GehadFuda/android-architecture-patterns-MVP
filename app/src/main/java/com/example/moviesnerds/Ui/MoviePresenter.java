package com.example.moviesnerds.Ui;

import com.example.moviesnerds.pojo.MovieModel;

public class MoviePresenter {
    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    public MovieModel getMovieFromDatabase() {
        return new MovieModel("cast away", "21-9-1996", "very sad movie", 1);
    }

    public void getMovieName() {
        view.onGetMovieName(getMovieFromDatabase().getName());
    }
}
