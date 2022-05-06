package models;

import java.util.HashMap;

public class Painting {
    private String name;
    private HashMap<String, Integer> price = new HashMap<>();
    private String year;

    public Painting(String name, String year, int adjPrice, int originalPrice) {
        this.name = name;
        this.year = year;
        price.put("adjustedPrice", adjPrice);
        price.put("originalPrice", originalPrice);
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }
}
