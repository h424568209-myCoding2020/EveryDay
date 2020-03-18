package day16;

import java.util.Scanner;

//句子逆序
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int t = 0;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') {
                    sb.insert(0, line.substring(t, i+1 ));
                    t = i+1;
                }
            }
            sb.insert(0,' ');
            sb.insert(0, line.substring(t, line.length()));
            System.out.println(sb.toString().trim());
        }
    }
}