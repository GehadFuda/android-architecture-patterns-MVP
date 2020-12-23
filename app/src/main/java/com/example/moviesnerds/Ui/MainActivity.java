package com.example.moviesnerds.Ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviesnerds.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieView {

    MoviePresenter presenter;
    @BindView(R.id.textView)
    TextView movieNameTextView;
    @BindView(R.id.button)
    Button getMovieButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getMovieButton.setOnClickListener(this);

        presenter = new MoviePresenter(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            presenter.getMovieName();
        }
    }

    @Override
    public void onGetMovieName(String movieName) {
        movieNameTextView.setText(movieName);
    }
}