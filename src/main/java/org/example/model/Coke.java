package org.example.model;

public class Coke extends ProductForSale {
    private String color;

    public Coke(String type, double price ,String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        super.showDetails();
    }
}
