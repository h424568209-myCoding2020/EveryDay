package day14;

import java.util.Scanner;

//空格替换城%20
public class Main2 {
    public  static String replaceSpace(String iniString, int length) {
        // write code here
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < iniString.length() ; i++){
            char c = iniString.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            int lne = scanner.nextInt();
            replaceSpace(line,lne);
        }
    }
}
