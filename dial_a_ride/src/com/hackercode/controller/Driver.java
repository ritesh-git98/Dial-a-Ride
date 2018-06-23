package com.hackercode.controller;
import com.hackercode.utilities.Dijktra;
import com.hackercode.utilities.ReadInput;
import com.hackercode.utilities.SortRequest;
import com.hackercode.utilities.OutputRevenue;
import  com.hackercode.utilities.Scheduling;

import java.io.IOException;

public class Driver {
    public static void main(String args[]) throws IOException {

            ReadInput ri = new ReadInput();
            ri.readBasics();
            SortRequest sr = new SortRequest();
            sr.sortReq(ri.getReq());
            Dijktra dj = new Dijktra();
            for (int k = 0; k <ri.getN(); k++) {
                dj.dij(ri.getLocation(), ri.getN(), k);
            }
             Scheduling sd=new Scheduling();
            sd.schedule(ri.getCar(),ri.getReq(),ri.getLocation());
            OutputRevenue o=new OutputRevenue();
            o.writeOutput(ri.getCar());



    }
}





































        /*//Dijkstra
        int n=5;
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
                Dijktra.dij(graph,n,i);
            }
        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + "  ");
            }
            System.out.println();
        }

    }*/






/*  Dijkstra
        0 3 0 1 0
        3 0 2 0 0
        0 2 0 2 4
        1 2 0 0 3
        0 0 4 3 0*/