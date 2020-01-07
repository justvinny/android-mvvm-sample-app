package com.aliasadi.mvvm.ui.details;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Intent;

import com.aliasadi.mvvm.data.network.model.Movie;


/**
 * Created by Ali Asadi on 12/03/2018.
 */
public class DetailsViewModel extends ViewModel {

    MutableLiveData<Movie> movie;

    public DetailsViewModel() {
        this.movie = new MutableLiveData<>();
    }

    public void loadMovieData(Intent intent) {
        assert intent.getExtras() != null;
        Movie movieExtra = intent.getExtras().getParcelable("movie");

        movie.postValue(movieExtra);
    }

    public MutableLiveData<Movie> getMovie() {
        return movie;
    }
}
