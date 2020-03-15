package 美团笔试;

import java.util.Scanner;

/**
 * 给出一个序列包含n个正整数的序列A，然后给出一个正整数x，你可以对序列进行任意次操作的，每次操作你可以选择序列中的一个数字，
 * 让其与x做按位或运算。你的目的是让这个序列中的众数出现的次数最多。
 * 请问众数最多出现多少次。
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int []arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt();
            }
            
        }
    }
}
