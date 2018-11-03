package com.example.serra.restaurandom.model;

import java.util.List;

public class RestaurantModel {
    public List<Business> businesses;

    public class Business {
        public string name;
        public float rating;
        public string address;
        public string category;
    }
}
