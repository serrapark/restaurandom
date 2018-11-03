package com.example.serra.restaurandom.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class APIRequestFilterModel implements Serializable {
    @SerializedName("term") public String term;
    @SerializedName("latitude") public float latitude;
    @SerializedName("longitude") public float longitude;
    @SerializedName("radius") public int radius;
    @SerializedName("categories") public String categories;
    @SerializedName("price") public String price;

    @SerializedName("limit") private int limit;
    @SerializedName("open_now") private boolean open_now;

    public APIRequestFilterModel() {
        this.limit = 50;
        this.open_now = true;
    }

    public APIResponseRestaurants Call() {
        // TODO
        return new APIResponseRestaurants();
    }
}
