package com.kainos.java.trainings.enums;

import java.sql.Array;

public class ShirtShop {
    public String name;
    public Shirt[] availableShirts;

    public ShirtShop(String name, Shirt[] availableShirts) {
        this.name = name;
        this.availableShirts = availableShirts;
    }

    public Shirt buyShirt(ShirtSize size, Color color, double price) {
            for (Shirt shirt : availableShirts) {
                if ((shirt.getSize().equals(size)) && (shirt.getColor().equals(color)) && (shirt.getPrice() == (price))){
                    removeShirt(shirt);
                    return shirt;
                }
            }
        return null;
    }

    private void removeShirt(Shirt shirt){
        for(int i=0; i<availableShirts.length; i++){
            if (availableShirts[i].equals(shirt)){
                availableShirts[i] = null;
            }
        }
    }

    public static void main(String[] args){
        Shirt T1 = new Shirt(ShirtSize.L, Color.RED, 5.3);
        Shirt T2 = new Shirt(ShirtSize.XL, Color.RED, 12.5);
        Shirt T3 = new Shirt(ShirtSize.M, Color.WHITE, 12.0);
        Shirt T4 = new Shirt(ShirtSize.L, Color.YELLOW, 8.5);
        Shirt T5 = new Shirt(ShirtSize.S, Color.RED, 12.5);
        Shirt T6 = new Shirt(ShirtSize.XL, Color.RED, 1.5);

        Shirt[] availableShirts = new Shirt[]{T1, T2, T3, T4, T5, T6};

        ShirtShop shop = new ShirtShop("Shop", availableShirts);

        Shirt purchasedShirt = shop.buyShirt(ShirtSize.XL,Color.RED,12.5);
        if(! purchasedShirt.equals(null)){
           System.out.println(purchasedShirt);
        }
        else{
            System.out.println("Null shirts");
        }
    }
}
