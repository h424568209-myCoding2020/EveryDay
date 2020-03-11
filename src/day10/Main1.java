package day10;
import java.util.Scanner;

//球的半径和体积
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            int z0 = scanner.nextInt();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int z1 = scanner.nextInt();
            double r;
            double s;
            r=Math.sqrt((x1- x0) *(x1-x0) + (y1-y0) *(y1- y0) + (z1-z0) *(z1-z0));
            s = 4*Math.acos(-1)*r*r*r/3;
            System.out.printf("%.3f",r);
            System.out.print(" ");
            System.out.printf("%.3f",s);
        }
    }
}
