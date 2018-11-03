package com.example.serra.restaurandom.model;

import java.util.List;

public class RestaurantModel {
    public List<Business> businesses;

    public class Business {
        public String name;
        public float rating;
        public String address;
        public String category;
    }
}
