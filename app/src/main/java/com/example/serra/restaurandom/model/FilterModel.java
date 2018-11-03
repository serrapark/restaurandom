package com.example.serra.restaurandom.model;

import java.io.Serializable;
import java.util.List;

public class FilterModel implements Serializable {
    public int price;
    public int radius;
    public List<String> categories;
    public boolean togo;
    public boolean delivery;
}
