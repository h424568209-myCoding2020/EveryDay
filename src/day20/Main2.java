package day20;

import java.util.Scanner;

//逆置字符串
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine().trim();
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < line.length() ; i++){
                char c=  line.charAt(i);
                if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                    sb.append(c);
                }else{
                    sb.append(" ");
                }
            }

            String[] sa=sb.toString().trim().split(" ");
            StringBuffer res = new StringBuffer();
            for(int j=sa.length-1;j>=0;j--){
                if(sa[j].equals(" ")){
                    continue;
                }
                res.append(sa[j]).append(" ");
            }
            System.out.println(res.substring(0,res.length()-1).toString());
        }
    }
}
