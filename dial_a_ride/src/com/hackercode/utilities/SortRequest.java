package com.hackercode.utilities;

public class SortRequest {
    public void sortReq(Request[] req){
        new Request();
        Request r;
        int i,j;
        for (i=0;i<20;i++){
            for (j=0;j<20;j++){
                if ((req[i].getEndTime())>(req[j].getEndTime())){
                    r =req[i];
                    req[i]=req[j];
                    req[j]= r;
                }
            }
        }


    }
}
