package day1;

import java.util.Scanner;

public class Main {
    static String[] arr = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String money = scanner.next();
            System.out.println(judge(money));
        }
        scanner.close();
    }

    private static String judge(String money) {
        String [] s = money.split("\\.");
        int m = Integer.valueOf(s[0]);
        StringBuffer res=  new StringBuffer("人民币");
        int y = m/100000000;
        if(y!=0){
            res.append(resolve1(y)).append("亿");
            m = m - y * 100000000;
        }
        int w = m/10000;
        if(w!=0){
            res.append(resolve1(w)).append("万");
            m = m- w*10000;
        }
        String before = resolve1(m);
        if(before.length()>1){
            res.append(before).append("元");
        }
        if(s.length>1){
            String after = s[1];
            res.append(resolve2(after));
        }
        String resString = res.toString();
        if(resString.length()>4 && resString.charAt(3)=='零' && resString.charAt(4)!='元'){
            System.out.println(resString.substring(0,3));
            resString = resString.substring(0,3)+resString.substring(4);
        }
        return resString;
    }

    private static String resolve2(String after) {
        String res=  "";
        if(after.equals("00") || after.equals("0")){
            return "整";
        }
        if(after.charAt(0)!= '0'){
            res+=arr[Integer.valueOf(after.charAt(0)+"")-1]+"角";
        }
        if(after.charAt(1)!='0'){
            res+=arr[Integer.valueOf(after.charAt(1)+"")-1]+"分";
        }
        return res;
    }

    private static String resolve1(int y) {
        StringBuffer res=  new StringBuffer();
        int q = y/1000;
        if(q!=0){
            res.append(arr[q-1]).append("仟");
            y = y - q*1000;
        }
        int b  = y/100;
        if(b!=0){
            res.append(arr[b-1]).append("佰");
            y = y -b*100;
        }
        if(q!=0 && b ==0){
            res.append("零");
        }
        int s = y/10;
        if(s !=0){
            if(s!=1){
                res.append(arr[s-1]);
            }
           res.append("拾");
            y = y - s*10;
        }
        if(b != 0 && s ==0){
            res.append("零");
        }
        int g = y%10;
        if(g!=0){
            if(q== 0 && b == 0 && s==0){
                res.append("零");
            }
            res.append(arr[g-1]);
        }
        return  res.toString();
    }
}
