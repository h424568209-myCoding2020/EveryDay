package day4;

import java.util.Scanner;

/**
 * 合格的密码
 * 1、长度不小于8
 * 2、至少包含三种字符
 * 3、重复子串长度不超过2
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String password = scanner.nextLine();
            if(judgelen(password) && judgepiece(password) && judge(password)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    private static boolean judge(String password) {
        for(int i =0  ; i < password.length()-2 ; i++){
            String substr1 = password.substring(i,i+3);
            if(password.substring(i+1).contains(substr1)){
                return false;
            }
        }
        return  true;
//        for(int i = 0 ; i < password.length()-3 ; i++){
//            String s = password.substring(i+3,password.length());
//            System.out.println(password.substring(i,i+3));
//            if(s.contains(password.substring(i,i+3))){
//                return false;
//            }
//        }
//        return true;
    }

    private static boolean judgepiece(String password) {
        int q1 = 0;
        int q2 = 0;
        int q3= 0;
        int q4 = 0 ;
        for(int i = 0 ; i < password.length() ; i++){
            char c = password.charAt(i);
            if(c<='z'&& c>='a' ){
                if(q1 == 1){
                    continue;
                }
                q1++;
            } else if(c<='Z' && c>='A' ){
                if(q2 ==1){
                    continue;
                }
                q2 ++;
            }else  if(c>='0' && c<='9'){
                if(q3==1){
                    continue;
                }
                q3++;
            }else {
                if(q4==1){
                    continue;
                }
                q4++;
            }
        }
        if(q1+q2+q3+q4>=3){
            return true;
        }
        return  false;
    }

    private static boolean judgelen(String password) {
        if(password.length() <= 8 || password == null){
            return false;
        }
        return true;
    }
}
