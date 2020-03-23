package day20;

import java.util.Scanner;

//驼峰命名法
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            String []arr = s.split("_");
            for(int i = 0 ; i < arr.length ; i ++){
                if(i == 0){
                    sb.append(arr[i]);
                    continue;
                }
                sb.append(arr[i].toUpperCase().charAt(0)).append(arr[i].toLowerCase().substring(1));
            }
            System.out.println(sb.toString());
        }
    }
}
