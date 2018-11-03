package com.example.serra.restaurandom.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class ApiResponseBusinesses implements Serializable {
    @SerializedName("businesses") public List<Business> businesses;

    public Business GetRandom() {
        return this.businesses.remove(new Random().nextInt(businesses.size()));
    }
}
