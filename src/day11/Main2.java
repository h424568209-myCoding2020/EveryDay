package day11;

import java.util.Scanner;

public class Main2 {
    //股票买卖收益最大化 ，只能买卖两次  手中只能有一支股票
    public static int calculateMax(int[] prices) {
        //s1 表示第一次买入后的钱，s2表示第一次卖出后的钱，s3表示第二次买入后的钱 ，s4表示第二次卖出后的钱
        int s1 = -prices[0];
        int s2=  Integer.MIN_VALUE;
        int s3 = Integer.MIN_VALUE;
        int s4 = Integer.MIN_VALUE;
        for(int i = 1; i < prices.length ; i++){
            s1 = Math.max(s1,-prices[i]);  //买入价格更低的股票
            s2 = Math.max(s2,s1+prices[i]); //卖出当前股票或者不操作
            s3 = Math.max(s3,s2-prices[i]); //第二次买入，或者不操作
            s4 = Math.max(s4,s3+prices[i]); //第二次卖出，或者不操作
        }
        return Math.max(0,s4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int []arr  =new int[n];
            for(int i =0 ; i < n ; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(calculateMax(arr));
        }
    }
}
