package day12;

import java.util.Scanner;

//十六进制转十进制
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
//            String line = scanner.nextLine().substring(2);
//            System.out.println(Integer.parseInt(line,16));

            String line = scanner.nextLine();
            StringBuffer sb = new StringBuffer(line);
            String s= sb.reverse().substring(0,sb.length()-2);
            char []arr = s.toCharArray();
            int sum = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] >='A' && arr[i] <='F'){
                    sum += ((arr[i] - 55) *Math.pow(16,i));
                }else {
                    sum += (arr[i] - 48) *Math.pow(16,i);
                }
            }
            System.out.println(sum);
        }

    }
}
