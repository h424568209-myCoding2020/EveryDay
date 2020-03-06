package day5;

import java.util.Scanner;

// 抽奖，抽不中自己的概率
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            float res = (mistake(n)/all(n))*100;
            System.out.println(String.format("%.2f",res)+ "%");
        }
    }
    private static float all(int n) {
        if(n == 0)
            return  1;
        return n * all(n-1);
    }
//5
    private static float mistake(int n) {
        if(n == 1){
            return  0;
        }
        if(n ==2){
            return  1;
        }
        return (n-1) *( mistake(n-1)+ mistake(n-2));
    }
}
