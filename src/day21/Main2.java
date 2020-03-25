package day21;

import java.util.*;

//兄弟字符串
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] arr = new String[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = scanner.next();
            }
            String key = scanner.next();
            int  k = scanner.nextInt();
            char []as = key.toCharArray();
            Arrays.sort(as);
            int count = 0 ;
            List<String> list = new ArrayList<>();
            for(int i = 0 ; i < n ; i ++){
              if(checkTheString(arr[i],as,key)){
                  count++;
                  list.add(arr[i]);
              }
            }
            System.out.print(count+" ");
            Collections.sort(list);
            if(count >= k)
            System.out.print(list.get(k-1));
        }
    }

    private static boolean checkTheString(String s, char[] as, String key) {
        if(key.length() != s.length()||s.equals(key)){
            return false;
        }
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        for(int i = 0 ; i < s.length() ; i ++){
            if(arr[i] != as[i]){
                return false;
            }
        }
        return true;
    }
}
