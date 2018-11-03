package com.example.serra.restaurandom.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Business implements Serializable {
    @SerializedName("name") public String name;
    @SerializedName("display_phone") public String display_phone;
    @SerializedName("distance") public float dist;
    @SerializedName("id") public String business_id;
    @SerializedName("image_url") public String image_url;
    @SerializedName("price") public String price;
    @SerializedName("rating") public float rating;
    @SerializedName("review_count") public int review_count;
    @SerializedName("url") public String url;
    @SerializedName("location") public LocationModel location;

    public class LocationModel implements Serializable {
        @SerializedName("display_address") public List<String> address;
    }
}