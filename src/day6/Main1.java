package day6;

import java.util.Scanner;

//奇偶校验
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            for(int i = 0 ; i < s.length(); i  ++){
                int c =s.charAt(i);
                if(cal(c)%2==0){
                    c += 128;
                }
                System.out.println(trans(c));
            }
        }
    }

    private static String trans(int c) {
        StringBuffer sb = new StringBuffer();
        int n = 128;
        for(int i = 0 ; i < 8 ; i++){
            if((c & n ) == n){
                sb.append(1);
            }else {
                sb.append(0);
            }
            n = (n >>1);
        }
        return sb.toString();
    }

    private static int cal(int c) {
        int  flag = 1;
        int count = 0 ;
        for(int i = 0 ; i < 8 ; i ++){
            if((c & flag) == flag){
                count++;
            }
           flag = ( flag <<1 );
        }
        return  count;
    }
}
