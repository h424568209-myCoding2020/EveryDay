package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int p = scanner.nextInt();
            int [][]arr =new int[n][m];
            for(int i = 0 ; i < m ; i++ ){
                for(int j = 0 ; j < n ; j++){
                    arr[i][j] = scanner.nextInt();
                }
            }
            int i = 0;
            int j = 0;
              List<int[]> list = new ArrayList<>();
            escapeTheWorld(list,arr,i ,j,p);

        }
    }

    private static void escapeTheWorld(List<int[]> list, int[][] arr, int i, int j,int p) {
        if(i < 0 ||  i > arr[0].length -1 || j<0  || j >arr.length-1){
            return;
        }
        if(arr[i][j] == 0){
            return;
        }
        if( p ==0){
            System.out.println("Can not escape!");
            return;
        }
        list.add(new int[]{i,j});
        if(i == 0 && j == arr[0].length -1){
            for(int k = 0 ; k < list.size() ; k++){
                System.out.println(Arrays.deepToString(new int[][]{list.get(k)}));
            }
            return;
        }

        for( ; i < arr.length -1 ; i++){
            for( ; j < arr[0].length-1 ; j++){
                    escapeTheWorld(list,arr,i,j+1,p-1);

                    escapeTheWorld(list,arr,i-3,j,p-3);
                    escapeTheWorld(list,arr,i+1,j,p);
            }
        }
    }
}
