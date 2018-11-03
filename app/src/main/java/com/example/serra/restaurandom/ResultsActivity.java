package com.example.serra.restaurandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.serra.restaurandom.model.APIResponseRestaurants;
import com.example.serra.restaurandom.model.Restaurant;

public class ResultsActivity extends AppCompatActivity {

    ImageView imageIV;
    TextView nameTV;
    RatingBar ratingRB;
    TextView categoryTV;
    TextView addressTV;
    Button rerollButton;

    APIResponseRestaurants restaurants;
    Restaurant restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        imageIV = findViewById(R.id.results_activity_photo);
        imageIV.setImageResource(0); //TODO

        nameTV = findViewById(R.id.results_activity_restaurant_name);
        nameTV.setText(restaurant.name);

        ratingRB = findViewById(R.id.results_activity_rating);
        ratingRB.setRating(restaurant.rating);

        categoryTV = findViewById(R.id.results_activity_category);
        categoryTV.setText(restaurant.categories.toString());

        addressTV = findViewById(R.id.results_activity_address);
        addressTV.setText(restaurant.location.toString());

        rerollButton = findViewById(R.id.results_activity_reroll);
        rerollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
