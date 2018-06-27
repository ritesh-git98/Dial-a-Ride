package com.hackercode.utilities;


public class OutputRevenue {
    public void writeOutput(Car car[]){
        int TotalRevenue=0;
        for (int i=0;i<car.length;i++){
            TotalRevenue+=car[i].getRevenue();
        }
        System.out.println("Revenue= "+TotalRevenue);

    }


}
