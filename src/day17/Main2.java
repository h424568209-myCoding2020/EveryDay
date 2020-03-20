package day17;

import java.util.Scanner;
//坐标移动
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String []arr = line.split(";");
            int []res = {0,0};
            for(int i = 0 ; i < arr.length; i++){
                if(arr[i].length() > 3 || arr[i].length() ==0){
                    continue;
                }
                if(isLeagleString(arr[i])){
                    char c = arr[i].charAt(0);
                    if(c == 'A'){
                        res[0] -= Integer.valueOf(arr[i].substring(1));
                    }else if(c=='D'){
                        res[0] += Integer.valueOf(arr[i].substring(1));
                    }else  if(c == 'W'){
                        res[1] += Integer.valueOf(arr[i].substring(1));
                    }else  if(c =='S'){
                        res[1] -= Integer.valueOf(arr[i].substring(1));
                    }else {
                        continue;
                    }
                }
            }
            System.out.println("("+ res[0]+"," + res[1]+")");
        }
    }

    private static boolean isLeagleString(String s) {
        if(s.length() == 1){
            return false;
        }
        if(s.length() ==2){
            char c1 = s.charAt(0);
            char c2 = s.charAt(1);
            if(c2 >='0' && c2 <='9'&&(c1 =='A'||c1=='S'  || c1 == 'W' || c1 =='D'))
                return true;
            return false;
        }
        if(s.length() ==3){
            char c1 = s.charAt(0);
            char c2 = s.charAt(1);
            char c3 = s.charAt(2);
            if(c2 >='1' && c2 <='9'&&c3 >='0' && c3 <='9'&& (c1 =='A'||c1=='S'  || c1 == 'W' || c1 =='D'))
                return true;
            return false;
        }
        return false;
    }
}
