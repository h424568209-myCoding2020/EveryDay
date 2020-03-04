package  day3;
import java.util.*;

/**
 *  找X，找到返回下标，否则返回-1
 */
public class Main1{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList();
            for(int i = 0 ; i < n ; i++){
                list.add(scanner.nextInt());
            }
            int x = scanner.nextInt();
            if(list.contains(x)){
                System.out.println(list.indexOf(x));
            }else{
                System.out.println(-1);
            }

        }
        scanner.close();
    }
}