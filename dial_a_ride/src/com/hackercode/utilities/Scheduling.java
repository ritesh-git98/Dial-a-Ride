package com.hackercode.utilities;

import com.hackercode.constants.Constants;

public class Scheduling {


    public void schedule(Car car[], Request r[], int loc[][]){
       //Loop to find car that will serve
        for (int i=0;i< r.length;i++){
            int carNumber=0;
                for (int k=0;k<car.length;k++){
                    if (car[k].getCap()>0){
                        carNumber=k;
                    }
                }
                //This is done to send car to src of request
                if ((car[carNumber].getLocation()-1)!=r[i].getSrc()){
                    int srtDist=loc[car[carNumber].getLocation()-1][r[i].getSrc()-1];
                    car[carNumber].setLocation(r[i].getSrc());
                    car[carNumber].setCarTime(2*srtDist);
                }
            //Wait
                if (car[carNumber].getCarTime()<r[i].getSrtTime()){
                    car[carNumber].setCarTime(r[i].getSrtTime());
                }
            //Scheduling a request
                if ((car[carNumber].getCap()>0)&&(car[carNumber].getCarTime()>=r[i].getSrtTime())&&(car[carNumber].getCarTime()<=r[i].getEndTime())){
                    car[carNumber].setRevenue(car[carNumber].getRevenue()+(2*loc[car[carNumber].getLocation()][r[i].getDest()-1]));
                    car[carNumber].setCap(car[carNumber].getCap()-1);
                    int[] indeces=car[carNumber].getPassengerLocation();
                    System.out.println(Constants.requestServed +i +" "+r[i].getSrc()+Constants.space +r[i].getDest()+Constants.space +r[i].getSrtTime()+Constants.space +r[i].getEndTime());
                    try{
                        for (int j=0;j<5;j++){
                            if (indeces[j]==0){
                               indeces[j]=r[i].getDest();
                               break;
                            }
                        }
                    } catch (NullPointerException e){
                        System.out.println(Constants.requestNotServed+Constants.space+(i+1));
                    }
                    car[carNumber].setPassengerLocation(indeces);
                }
                //drop to respective location
                if (car[carNumber].getCap()==5) {
                     int[] dropLocation = car[carNumber].getPassengerLocation();
                          for (int j = 0; j < 5; j++) {
                              if (car[carNumber].getLocation() != dropLocation[i]) {
                                  int srtDist=loc[car[carNumber].getLocation()-1][dropLocation[i]-1];
                                  car[carNumber].setCarTime(car[carNumber].getCarTime()+(2*srtDist));
                              }
                            car[carNumber].setCap(car[carNumber].getCap()+1);
                          }
                }
                car[carNumber].setPassengerLocationReset();
            }

        }
    }
