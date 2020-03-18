package day16;
import java.util.*;

//删除公共字符
public class Main2 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            List<Character> list = new ArrayList();
            for(int i = 0 ; i < line2.length() ; i++){
                list.add(line2.charAt(i));
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < line1.length() ; i++){
                if(!list.contains(line1.charAt(i))){
                    sb.append(line1.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
}
