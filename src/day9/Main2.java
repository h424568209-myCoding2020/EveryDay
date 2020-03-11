package day9;

import java.util.Scanner;

//上楼梯
public class Main2 {
    public static int countWay(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        int array[] = new int[n];
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for (int i = 3; i < n; i++) {
            array[i] = ((array[i - 1] + array[i - 2]) % 1000000007 + array[i - 3] % 1000000007) % 1000000007;
        }
        return array[n - 1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
         //   System.out.println(countWays(n));
            System.out.println(countWay(n));
        }
    }
}
