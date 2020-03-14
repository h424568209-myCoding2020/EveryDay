package day12;

import java.util.Scanner;

// 输入一行内容，输出出现A-Z的个数
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int[] arr = new int[26];
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                    arr[line.charAt(i) - 'A']++;
                }
            }
            char c = 'A';
            for (int i = 0; i < 26; i++) {
                System.out.println((char) (c++) + ":" + arr[i]);
            }
        }
    }
}
