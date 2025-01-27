package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public String getType() {
        System.out.println(type);
        return type;
    }

    public double getPrice() {
        System.out.println(price);
        return price;
    }

    public String getDescription() {
        System.out.println(description);
        return description;
    }

    public double getSalesPrice(int quantity){
    return quantity * getPrice();
    }

    public void showDetails() {
        System.out.println(getDescription());
        System.out.println(getPrice());
        System.out.println(getType());
    }
}



