package day23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//合唱团
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            //总人数
            int n = scanner.nextInt();
            //学生能力值数组，第i个人直接对应arr[i]
            int []arr = new int[n+1];
            //初始化，人直接对应坐标
            for(int i = 1 ; i <= n ; i++){
                arr[i] = scanner.nextInt();
            }
            //选择的学生数
            int kk = scanner.nextInt();
            //间距
            int dd = scanner.nextInt();
            /**
             * 递推的时候，以f[one][k]的形式表示
             * 其中： one表示最后一个人的位置，k为包括这个人，一共有k个人
             * 原问题和子问题的关系 f[one][k] = max{f[left][k-1] * arr[one],g[left][k-1] *arr[one]}
             */
            //规划数组
            long [][] f = new long[n+1][kk+1];
            long [][] g = new long[n+1][kk+1];
            //初始化k=1的情况
            for(int one = 1 ; one <=n ;one ++){
                f[one][1] = arr[one];
                g[one][1] = arr[one];
            }
            //自底向上递推
            for(int k =2 ; k < kk ; k++){
                for (int one = k ; one <= n ; one ++){
                    long tempmax = Long.MIN_VALUE;
                    long tempmin = Long.MAX_VALUE;
                    for(int left = Math.max(k-1,one-dd); left <=one-1 ; left ++){
                        if(tempmax <Math.max(f[left][k-1] * arr[one],g[left][k-1] * arr[one])){
                            tempmax = Math.max(f[left][k-1] * arr[one],g[left][k-1]*arr[one]);
                        }
                        if(tempmin > Math.min(f[left][k-1] * arr[one],g[left][k-1] * arr[one])) {
                            tempmin = Math.min(f[left][k - 1] * arr[one], g[left][k - 1] * arr[one]);

                        }
                    }
                        f[one][k] = tempmax;
                        f[one][k] = tempmin;
                    }
            }
            long result = Long.MIN_VALUE;
            for(int one  =  kk ; one <= n ; one ++){
                if(result < f[one][kk]){
                    result = f[one][kk];
                }
            }
            System.out.println(result);
        }
    }
}
