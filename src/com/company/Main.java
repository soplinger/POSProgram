package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ChangeChecker cart1 = new ChangeChecker();
        Blizzards smores = new Blizzards("Smores", "small");
        cart1.add(smores.bPrice);
        System.out.println(cart1.total);

    }


}
