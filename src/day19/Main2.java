package day19;

import java.util.*;

/**
 * 求和，输入n和m  求1-n中所有数组合之和为m的组合
 * 背包问题
 */
public class Main2 {
 static    List<Integer> list = new ArrayList<>();
 static List<List>res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            dfs(1,m,n);
           for(List l :res){
               int i = 0;
               for(; i < l.size() -1; i++){
                   System.out.println(l.get(i)+" ");
               }
               System.out.println(list.get(i));
           }
        }
    }

    private static void dfs(int index, int count, int n) {
        if(count == 0){
            res.add(new ArrayList<>(list));
        }else {
            for(int i  = index ; i <=count && i <= n ; i++){
                list.add(i);
                dfs(i+1,count-i,n);
                list.remove(list.size()-1);
            }
        }

    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            int n =  scanner.nextInt();
//            int m = scanner.nextInt();
//            List<Integer> list = new ArrayList<>();
//            CalNumOfM(m,n>m?m:n, list);
//            Collections.sort(res, new Comparator<List>() {
//                @Override
//                public int compare(List o1, List o2) {
//                    return ((int)o1.get(0) - (int)o2.get(0));
//                }
//            });
//            for(int i = 0 ; i < res.size() ; i++){
//                for(int j = 0 ; j < res.get(i).size() ; j++){
//                    if(j == res.get(i).size()-1){
//                        System.out.println(res.get(i).get(j));
//                    }else {
//                        System.out.print(res.get(i).get(j) +" ");
//                    }
//                }
//            }
//        }
//    }
//static List<List> res = new ArrayList<>();
//    private static void CalNumOfM(int m, int n,List<Integer>list) {
//        if(m == 0){
//            Collections.sort(list);
//            res.add(list);
//            return;
//        }
//        if(n<=0  || m < 0 ){
//            return;
//        }
//        List list1 = new ArrayList(list);
//        CalNumOfM(m,n-1,list);
//
//        list1.add(n);
//        CalNumOfM(m-n,n-1,list1);
//    }
}
