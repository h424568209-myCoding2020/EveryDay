package day2;

import java.util.Scanner;
public class Main1{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String n = scanner.next();
            int num = 0 ;
            int sub = 0 ;
            for(int i = 0 ; i < n.length() ; i++){
                num += n.charAt(i)-'0';
            }
            int x = Integer.valueOf(n);
            x = x*x;
            String s = String.valueOf(x);
            for(int i = 0 ; i < s.length() ; i++){
                sub += s.charAt(i)-'0';
            }
            System.out.println(num +" "+ sub);
        }
    }
}