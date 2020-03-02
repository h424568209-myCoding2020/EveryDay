package day1;

import java.util.Arrays;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int []arr1 = new int[n];
            int prot = 0 ;
            for(int i = 0 ; i < n ; i ++){
                arr1[i] = scanner.nextInt();
                prot+=arr1[i];
            }
            double []arr2 = new double[n];
            for(int i =0 ; i < n ; i ++){
                arr2[i] = scanner.nextInt();
                if(arr2[i]>=90){
                    arr2[i] = 4;
                }else if(arr2[i]>=85&&arr2[i]<90){
                    arr2[i]=3.7;
                }else if(arr2[i]>=82&&arr2[i]<85){
                    arr2[i]=3.3;
                }else if(arr2[i]>=78&&arr2[i]<82){
                    arr2[i]=3.0;
                }else if(arr2[i]>=75&&arr2[i]<78){
                    arr2[i]=2.7;
                }else if(arr2[i]>=72&&arr2[i]<75){
                    arr2[i]=2.3;
                }else if(arr2[i]>=68&&arr2[i]<72){
                    arr2[i]=2.0;
                }else if(arr2[i]>=64&&arr2[i]<68){
                    arr2[i]=1.5;
                }else if(arr2[i]>=60&&arr2[i]<64){
                    arr2[i]=1.0;
                }else{
                    arr2[i]=0;
                }
            }
            double projict  = 0;
            for(int i = 0 ; i < n ; i++){
                projict += (arr2[i]*arr1[i]);
            }
            double x = projict/prot;
            System.out.printf("%.2f",x);
        }
        scanner.close();
    }
}
