package day10;

import java.util.*;

//旧键盘
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            //long
            String line1 = scanner.nextLine();
            //short
            String line2 = scanner.nextLine();
            Map <Character,Integer > map1 = new HashMap<>();
            line1 = line1.toUpperCase();
            line2 = line2.toUpperCase();
            for(int i =0 ; i< line2.length() ; i++){
                char c = line2.charAt(i);
                if(!map1.containsKey(c)){
                    map1.put(c,i);
                }
            }
           // System.out.println(map1);
            List<Character> list = new ArrayList<>();
            for(int i = 0 ; i < line1.length();  i++){
                char c = line1.charAt(i);
         //       System.out.print(c);
                if(!map1.containsKey(c) && !list.contains(c)){
                    list.add(c);
                }
            }
      //      System.out.println();
            for(int i =0 ; i < list.size() ; i++){
                System.out.print(list.get(i));
            }
        }
    }
}
