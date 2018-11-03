package com.example.serra.restaurandom.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class APIResponseRestaurants implements Serializable {
    @SerializedName("businesses") public List<Restaurant> restaurants;

    public Restaurant GetRandom() {
        return this.restaurants.remove(new Random().nextInt(restaurants.size()));
    }
}
