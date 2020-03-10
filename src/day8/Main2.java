package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public  static int countNumberOf2s(int n) {
        // write code here

        int count = 0, i;
        if (n < 2) return 0;
        else if (n <= 10) return 1;
        else for (int j = 2; j <= n; j++) {
                i = j;
                while (i > 0) {
                    if (i % 10 == 2) count++;
                    i /= 10;
                    if (i == 0) break;
                }
            }
        return count;

//
//        int []arr = new int[n];
//        for(int i =0 ; i < n ; i++){
//            arr[i] = i+1;
//        }
//        System.out.println(Arrays.toString(arr));
//        String []res = new String[n];
//        for(int i =0 ; i < n ;i++){
//            res[i] = String.valueOf(arr[i]);
//        }
//        System.out.println(Arrays.toString(res));
//        int count = 0;
//        for(int i =0 ; i < n ; i++){
//            for(int j = 0 ;j < res[i].length() ;j++){
//                char c = res[i].charAt(j);
//                if(c == '2'){
//                    System.out.print(res[i]+" ");
//                    count++;
//                }
//            }
//        }
//        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(countNumberOf2s(n));
        }
    }
}
