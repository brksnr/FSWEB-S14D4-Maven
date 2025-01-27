package org.example.model;

public class Chocolate extends ProductForSale {
    private String color;
    public Chocolate(String type, double price, String description) {
        super(type,price, description );
    }

    @Override
    public void showDetails() {
        super.showDetails();
    }
}
