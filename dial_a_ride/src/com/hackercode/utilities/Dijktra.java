package com.hackercode.utilities;
public class Dijktra {
    public  void dij(int location[][],int n,int src) {

        int[] visited = new int[n];
        int inf = 999;
        int[] distance = new int[n];
        int v=0 ;

        distance = location[src];
        visited[src] = 1;

        distance[src] = 0;
        for (int i = 0;i < n; i++)
        {
            inf = 999;
            for (int j = 0; j < n; j++) {
                if (inf > distance[j] && visited[j] != 1) {
                    inf = distance[j];
                    v = j;
                }
            }
        }
        visited[v] = 1;
        for (int j = 0;j < n; j++)
        {
            if (((inf + location[j][v]) < distance[j]) && (visited[j] != 1)) {
                distance[j] = inf + location[j][v];

            }
        }

        for(int i=0;i<n;i++) location[src][i] = distance[i];

    }
}
