package day19;

import java.util.*;

public class Main1 {
  private static   Map<String,Integer> map = new HashMap<>();
  private static List<String> list = new ArrayList<>();
  private static List<String> res= new ArrayList<>();
    private  static  Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n  = scanner.nextInt();
            for(int i = 0 ; i < n ; i ++){
                list.add(scanner.nextLine());
            }
            map.put("ABC",2);
            map.put("DEF",3);
            map.put("GHI",4);
            map.put("JKL",5);
            map.put("MNO",6);
            map.put("PQRS",7);
            map.put("TUV",8);
            map.put("WXYZ",9);
            CalPhoneNum(n);
            Collections.sort(res, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
           for(int i = 0 ; i < res.size() ; i++){
               System.out.println(res.get(i));
           }
            System.out.println();
            res.clear();
            list.clear();
        }
    }

    private static void CalPhoneNum(int n) {
        for(int i = 0 ; i < n ; i ++){
            String s= list.get(i);
            StringBuffer sb  = new StringBuffer();
            for(int j = 0 ; j < s.length() ; j++){
                if(sb.length() ==8){
                    break;
                }
                char c = s.charAt(j);
                if(c=='-' && sb.length()==3){
                    sb.append('-');
                    continue;
                }
                if(c=='-'){
                    continue;
                }
                if(sb.length()==3){
                    sb.append('-');
                }
                if(c>='0' && c<='9'){
                    sb.append(c);
                }else {
                    for(Map.Entry<String,Integer> m : map.entrySet()){
                        String k = m.getKey();
                        for(int x = 0 ; x < k.length() ; x++){
                            if(k.charAt(x) == c){
                                sb.append(m.getValue());
                                break;
                            }
                        }
                    }
                }
            }
            set.add(sb.toString());
            if(!res.contains(sb.toString())) {
                res.add(sb.toString());
            }
        }
    }
}
//3-10-10-10
//        -4-8-7-3-2-7-9-
