package com.example.serra.restaurandom.model;

import java.io.Serializable;
import java.util.List;

public class Filter implements Serializable {
    public String price;
    public int radius;
    public List<String> categories;
    public boolean togo;
    public boolean delivery;

    public APIRequestFilterModel ToAPIRequest() {
        APIRequestFilterModel filter = new APIRequestFilterModel();
        filter.categories = String.join(",", this.categories);
        filter.radius = this.radius;
        filter.price = this.price;
        return filter;
    }

}
