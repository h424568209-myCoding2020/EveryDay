package day7;

import java.util.Scanner;

//逆置字符串
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            String[] arr = line.split(" ");
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
                if (i != 0) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
        scanner.close();
    }
}