package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//最近公共祖先
public class Main1 {
    public static int getLCA(int a, int b) {
        // write code here
        if(a == b ){
            return a;
        }
        List<Integer> list = new ArrayList();
        list.add(a);
        while(a > 0){
            list.add(a/2);
            a = a/2;
        }
        while(b > 0){
            if(list.contains(b)){
                return b;
            }
            b = b /2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            getLCA(a,b);
        }
    }
}
