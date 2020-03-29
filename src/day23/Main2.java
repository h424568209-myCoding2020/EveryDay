package day23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//马戏团
public class Main2 {
  static   class People{
        int heght;
        int weight;
        public People(int weight ,int heght){
            this.weight = weight;
            this.heght = heght;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            People []arr = new People[n];
            for(int i = 0 ; i < n ; i ++){
                arr[scanner.nextInt()-1] = new People(scanner.nextInt(),scanner.nextInt());
            }
            Arrays.sort(arr, new Comparator<People>() {
                //小于 负数  等于 0  大于 正数
                @Override
                public int compare(People o1, People o2) {
                    int les = o1.weight - o2.weight;
                    return les!=0?les:o2.heght - o1.heght;
                }
            });
            System.out.println(theMaxNum(n,arr));
        }
    }

    private static int theMaxNum(int n, People[] arr) {
        int []res = new int[n];
        Arrays.fill(res,1);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j ++){
                if(arr[j].heght <= arr[i].heght){
                    res[i] = Math.max(res[i],res[j]+1);
                }
            }
            max =  Math.max(max,res[i]);
        }
        return max;
    }
}
