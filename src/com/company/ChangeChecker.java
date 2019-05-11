package com.company;

import java.util.ArrayList;

public class ChangeChecker {

    public double total;

   public static double change(double amt, double amtNeeded) {
       double change1 = amt - amtNeeded;
       return Math.round(change1 * 100.0) / 100.0;
   }

   public void add(double price){
       total += price;
   }

}
