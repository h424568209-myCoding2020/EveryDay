package day3;
import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
        public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
                String ip = scanner.next();
                String nums=  scanner.next();
                System.out.println(transip(ip));
                System.out.println(transips(nums));
            }
        }
        //10.0.3.193
        public static String transip(String ip){
            String []arr = ip.split("\\.");
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < 4 ; i++) {
                String s =  Integer.toBinaryString(Integer.valueOf(arr[i]));
                if(s.length() < 8){
                    for(int j = 0 ;j < 8-s.length() ; j++){
                        sb.append('0');
                    }
                }
                sb.append(s);
            }

            return Long.valueOf(sb.toString(),2).toString();
        }
        public static String transips(String ip){
            String x = Long.toBinaryString(Integer.valueOf(ip));
            StringBuffer sb = new StringBuffer();
            if(x.length() < 32){
                for(int i = 0 ; i < 32-x.length() ; i++){
                    sb.append('0');
                }
            }
            sb.append(x);
            StringBuffer res=  new StringBuffer();
            for(int i  =0 ; i <32  ;i+=8){
                res.append(Integer.valueOf(sb.substring(i,i+8),2)).append('.');
            }

            return  res.toString();
        }
    }

