package com.a3mcgill.g1.fruittotalprice;

public class FruitTotalPrice {
    private int quantity;
    private double totalPrice;
    private String fruit;
    private String month;
    private double price;

    public FruitTotalPrice(){}

    public FruitTotalPrice(String fruit, String month, double price, int quantity, double totalPrice) {
        this.fruit = fruit;
        this.month = month;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        totalPrice = quantity * price;
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getFruit(){
        return fruit;
    }

    public void setFruit(String fruit){
        this.fruit = fruit;
    }

    public String getMonth(){
        return month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }


}

