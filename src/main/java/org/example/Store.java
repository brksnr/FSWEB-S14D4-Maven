package org.example;

import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;

public class Store {
    public static void main(String[] args) {

       ProductForSale[] listProducts = new ProductForSale[3];
       listProducts[0] = new Chocolate("çikolata", 25, "sütlü çikolata");
       listProducts[1] = new Coke("Kola",25,"şekerli kola");
       listProducts[2] = new Bread("Ekmek", 100, "Beyaz ekmek");

       listProducts(listProducts);
    }

    public static void listProducts (ProductForSale[] products) {
        for (int i = 0; i < products.length; i++){
            products[i].showDetails();
        }

    }
}