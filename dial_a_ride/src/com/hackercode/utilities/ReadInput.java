package com.hackercode.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ReadInput {
    private int n,N,c,R;
    private static int [][] location;
    private Request[] req;
    private Car car[];

    public int getN() {
                 return n;
             }
    public int getC() {
                return c;
            }
    public void setC(int c) {
                this.c = c;
            }

    public  void setLocation(int[][] location) {
        ReadInput.location = location;
    }

    public int getR() {
                return R;

            }
            public void setR(int r) {
                R = r;
            }
            public  int[][] getLocation() {
                return location;
            }

            public Car[] getCar() {
                return car;
            }
            public void setCar(Car[] car) {
                this.car = car;
            }
            public Request[] getReq() {
                return req;
            }
            public void setReq(Request[] req) {
                this.req = req;
            }

        public void readBasics() throws IOException{
        try {

                    Scanner sc = new Scanner(new File("C:\\Users\\Ritesh\\Desktop\\input.txt"));
                n = sc.nextInt();
                N = sc.nextInt();
                c = sc.nextInt();
                R = sc.nextInt();
                location = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        location[i][j] = sc.nextInt();
                    if (location[i][j]==-1){
                        location[i][j]=999;
                    }
                    }
                }
                    car = new Car[N];
                 for (int i = 0; i < N; i++) {
                    car[i]= new Car();
                    car[i].setCap(c);
                }
                for (int i = 0; i < N; i++) {
                    car[i].setLocation(sc.nextInt());
                }
                req = new Request[R];

                 for (int i = 0; i < R; i++) {
                    req[i]= new Request();
                    }
                for (int i = 0; i < R; i++) {
                    req[i].setSrc(sc.nextInt());
                    req[i].setDest(sc.nextInt());
                    req[i].setSrtTime(sc.nextInt());
                    req[i].setEndTime(sc.nextInt());
                }

        } catch (Exception e){
            e.printStackTrace();
        }

    }



}
