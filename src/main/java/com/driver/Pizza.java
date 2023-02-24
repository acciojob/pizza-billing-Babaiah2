package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAway;
    boolean isbillCreated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isbillCreated = false;
        this.isTakeAway = false;

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded) {
            this.price += 80;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.price+=this.toppings;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isbillCreated) {
            if (isCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price:" + this.price + "\n";
            isbillCreated = true;
            return this.bill;
        }
        return "";
    }
}
