package com.hackercode.controller;
import com.hackercode.utilities.*;
import com.hackercode.constants.*;
import com.hackercode.utilities.Dijktras;
import java.util.Scanner;

public class Driver {
    public static void main(String args[]) {

        //Dijsktras

        int n=5;
        Scanner scan = new Scanner(System.in);


        int inf=999;
        int [][]graph =new int[n][n];
        for (int i = 0;i < n; i++)

        {
            for (int j = 0; j < n; j++) {

                graph[i][j] = scan.nextInt();
                if (graph[i][j] <= 0)
                    graph[i][j] = inf;
            }
        }
        for (int j = 0; j < n; j++){
            for(int i=0;i<n;i++){
                Dijktras.dij(graph,n,i);
            }

        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + "  ");
            }
            System.out.println();
        }

    }



}


/*  Dijsktras
        0 3 0 1 0
        3 0 2 0 0
        0 2 0 2 4
        1 2 0 0 3
        0 0 4 3 0