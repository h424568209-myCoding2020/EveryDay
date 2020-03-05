package day4;

import java.util.Scanner;
//守形数
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = n * n;
            StringBuffer sb1 = new StringBuffer(String.valueOf(n));
            StringBuffer sb2 = new StringBuffer(String.valueOf(m));
//            System.out.println(sb1.toString());
//            System.out.println(sb2.toString());
//            System.out.println(sb2.substring(sb2.length()-sb1.length(),sb2.length()).equals(sb1.toString()));
            if(sb1.toString().equals(sb2.substring(sb2.length() - sb1.length(),sb2.length()))){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
}
