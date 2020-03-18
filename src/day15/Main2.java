package day15;

import java.util.Scanner;


/**
 * 回文串 -- 一串字符加一个字符是否是回文
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line  = scanner.nextLine();
            if(line.length() ==1){
                System.out.println("Yes");
                break;
            }
            int start = 0;
            int end = line.length()-1;
            int flag = 0;
            while(start<= end){
                char c1= line.charAt(start);
                char c2 = line.charAt(end);
                if(c1 != c2){
                    if(start +1 <= end && line.charAt(start+1) == line.charAt(end)){
                        start++;
                        flag++;
                    }else  if(end -1 >= start && line.charAt(end-1) == line.charAt(start)){
                        end--;
                        flag++;
                    }else {
                        flag = 10;
                        break;
                    }
                }else {
                    start++;
                    end --;
                }
            }
            if(flag == 1 || flag == 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
