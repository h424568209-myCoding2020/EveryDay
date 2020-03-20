package day17;

//连续最大的子数组的和

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int []arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt();
            }
            int max = arr[0];
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                sum += arr[i];
                if(sum < arr[i]){
                    sum = arr[i];
                }
                if(sum > max    ){
                 max = sum;
                }
            }
        }

    }
}
