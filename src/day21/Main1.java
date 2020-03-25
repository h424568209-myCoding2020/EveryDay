package day21;

import java.util.Scanner;

public class Main1 {
    //乒乓球框
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String A = scanner.next();
            String B = scanner.next();
            int[] arr = new int[26];
            for (int i = 0; i < A.length(); i++) {
                char c = A.charAt(i);
                arr[c - 'A']++;
            }
            for (int i = 0; i < B.length(); i++) {
                char c = B.charAt(i);
                arr[c - 'A']--;
            }
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (arr[i] < 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
