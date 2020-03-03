package day2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            List<String> list = new ArrayList();
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(scanner.next());
            }
            int num = scanner.nextInt();
            int invalid = 0;
            int[] arrs = new int[n];
            for (int i = 0; i < num; i++) {
                String v = scanner.next();
                if (list.contains(v)) {
                    arrs[list.indexOf(v)]++;
                } else {
                    invalid++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(list.get(i) + " : " + arrs[i]);
            }
            System.out.println("Invalid" + " : " + invalid);
        }
    }
}
