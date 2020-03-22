package day19;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n =  scanner.nextInt();
            int m = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            CalNumOfM(m,n>m?m:n, list);
            Collections.sort(res, new Comparator<List>() {
                @Override
                public int compare(List o1, List o2) {
                    return ((int)o1.get(0) - (int)o2.get(0));
                }
            });
            for(int i = 0 ; i < res.size() ; i++){
                for(int j = 0 ; j < res.get(i).size() ; j++){
                    if(j == res.get(i).size()-1){
                        System.out.println(res.get(i).get(j));
                    }else {
                        System.out.print(res.get(i).get(j) +" ");
                    }
                }
            }
        }
    }
static List<List> res = new ArrayList<>();
    private static void CalNumOfM(int m, int n,List<Integer>list) {
        if(m == 0){
            Collections.sort(list);
            res.add(list);
            return;
        }
        if(n<=0  || m < 0 ){
            return;
        }
        List list1 = new ArrayList(list);
        CalNumOfM(m,n-1,list);

        list1.add(n);
        CalNumOfM(m-n,n-1,list1);
    }
}
