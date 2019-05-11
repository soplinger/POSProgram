package com.company;

public class Blizzards {

    public String bName;
    public String bSize;
    public double bPrice;

    public Blizzards(String name, String size){
        bName = name;
        bSize = size.toLowerCase();
        if (bSize.equals("mini"))
            bPrice = 2.89;
        if (bSize.equals("small"))
            bPrice = 3.69;
        if (bSize.equals("medium"))
            bPrice = 4.09;
        if (bSize.equals("large"))
            bPrice = 4.59;
    }


}
