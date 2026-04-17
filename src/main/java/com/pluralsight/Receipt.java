package com.pluralsight;
// step 3
public class Receipt {

public static void main(String[] args) {
   // variables w data for receipt parts'
    String item = "bag";
    double itemPrice = 2500.00;
    int itemCount = 1;

    //printing receipt w appropriate info
    System.out.println("You bought " + itemCount + " " + item + " for $" + itemPrice);

}
}
