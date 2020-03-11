package day9;

import java.util.*;
//锤子剪刀布
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Map<Character,Integer> mapA = new HashMap<>();
            Map<Character,Integer> mapB = new HashMap<>();
            int v = 0;
            int l = 0;
            for(int i =0 ; i < n ; i ++){
                char a = scanner.next().charAt(0);
                char b = scanner.next().charAt(0);
                int ret = cal(a,b);
                if(ret == 1){
                    v++;
                    if(mapA.containsKey(a)){
                        mapA.put(a,mapA.get(a)+1);
                    }else {
                        mapA.put(a,1);
                    }
                }else  if(ret == -1){
                    l++;
                    if(mapB.containsKey(b)){
                        mapB.put(b,mapB.get(b)+1);
                    }else {
                        mapB.put(b,1);
                    }
                }
            }
            System.out.println(v +" "+ (n-v-l)+" "+l);
            System.out.println(l +" "+ (n-v-l)+" "+v);
            int max = 0 ;
            for(Map.Entry<Character,Integer> map : mapA.entrySet()){
                    if(map.getValue()>max){
                        max = map.getValue();
                    }
            }
            if(max == 0){
                System.out.print("B"+" ");
            }
            else  for(Map.Entry<Character,Integer> map: mapA.entrySet()){
                if(map.getValue() == max){
                    System.out.print(map.getKey()+" ");
                    break;
                }
            }
            max = 0;

            for(Map.Entry<Character,Integer> map : mapB.entrySet()){
                if(map.getValue()>max){
                    max = map.getValue();
                }
            }
            if(max == 0){
                System.out.print("B"+" ");
            }
            else for(Map.Entry<Character,Integer> map: mapB.entrySet()){
                if(map.getValue() == max){
                    System.out.print(map.getKey());
                    break;
                }
            }
        }
    }

    private static int cal(char a, char b) {
        if(a==b){
            return 0;
        }else  if(a=='C' && b=='J'||a=='J'&&b=='B'||a=='B'&&b=='C'){
            return 1;
        }else
            return -1;
    }
}
