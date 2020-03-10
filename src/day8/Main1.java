package day8;
import java.util.*;
;public class Main1{
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] p = scanner.next().split("\\.");
            String[] a = scanner.next().split("\\.");
            int ps = (Integer.valueOf(p[0]) * 17 * 29 + Integer.valueOf(p[1]) * 29 + Integer.valueOf(p[2]));
            int as = (Integer.valueOf(a[0]) * 17 * 29 + Integer.valueOf(a[1]) * 29 + Integer.valueOf(a[2]));
            int m = as-ps;
            boolean flag = false;
            if(m <0){
                m = -m;
                flag = true;
            }
            int g = m/17/29;
            int s = (m - g *17*29) /29;
            int n =m - g*17*29 - s*29;
            if(flag){
                System.out.println("-"+g+"."+s+"."+n);
            }else {

                System.out.println(g+"."+s+"."+n);
            }
        }
    }
}