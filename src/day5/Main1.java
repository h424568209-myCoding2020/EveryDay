package day5;

import java.util.Arrays;
import java.util.Scanner;

//和为sum的组合个数
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int sum = scanner.nextInt();
            int []arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int start = 0 ;
            int count = 0 ;
            int num = 0 ;
            int i = 0 ;
            while(start!= n){
                num += arr[i];
                if(num < sum){
                    i++;
                }else {
                    if(num == sum){
                        count++;
                    }
                    num -= arr[start];
                    start++;
                }
            }
            System.out.println(count);
        }
    }
}
