package org.example.model;

public class Bread extends ProductForSale {
    private String color;

    public Bread(String type,double price, String description ) {
        super(type,price, description );
    }

    @Override
    public void showDetails() {
        super.showDetails();
    }
}
