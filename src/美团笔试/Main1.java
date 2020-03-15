package 美团笔试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 有一个2*n的网格，有一个人位于(1,1)的位置，即左上角，他希望从左上角走到右下角，即(2,n)的位置。在每一次，他可以进行三种操作中的一种：
 * 1． 向右走一格，即从(x,y)到(x,y+1);
 * 2． 向上右方走一格，即，如果他在(2,y)的位置可以走到(1,y+1);
 * 3． 向下右方走一格，即，如果他在(1,y)的位置可以走到(2,y+1);
 *  
 * 问题当然不会这么简单，在这2*n的格子中，有一部分格子上有障碍物，他不能停在障碍物上，当然也不能走出网格，请问他有多少种不同的路线可以到达(2,n)。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            String []arr = new String[2];
            arr[0] = scanner.next();
            arr[1] = scanner.next();
            System.out.println(Arrays.toString(arr));
            int k = 0 ;
            char [][] res= new char[2][n];
            for(int i = 0 ; i < n ; i++){
                char c = arr[k].charAt(i);
                res[k][i] = c;
            }
            k ++;
            for(int i = 0 ; i < n ; i ++){
                char c = arr[k].charAt(i);
                res[k][i] = c;
            }
            if(res[0][0] =='X'){
                System.out.println(-1);
                return;
            }
            int i = 0 ;
            int j = 0;
            System.out.println(calWays(res,i,j));
        }
    }

    private static int calWays(char[][] res,int i,int j ) {
        if(i < 0 || j >res[0].length -1 ||i >1 || j<0 ){
            return 0;
        }
        if(res[i][j] =='X'){
            return 0;
        }
        if( i == 1 && j == res[0].length-1){
            return 1;
        }
              for( ; i < res.length ; ){
            for(; j < res[0].length ; ){
                if(res[i][j] == '.'){
                    return calWays(res,i+1,j+1)+calWays(res,i,j+1)+calWays(res,i-1,j+1);
                }
            }
        }
        return 0;
    }
}
