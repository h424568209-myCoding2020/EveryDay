package day15;

/**
 * 打印二维数组 从右上角到左下角
 */
public class Main1 {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int i = 0 , j = n-1;
        int []res = new int[n*n];
        int k = 0;
        while( i < n && j >= 0){
            int t1 = i;
            int t2 = j;
            while(t1 < n && t2<n){
                res[k++] = arr[t1++][t2++];
            }
            if(i==0 && j ==0){
                i++;
            }else if(i ==0){
                j--;
            }else {
                i++;
            }
        }
        return res;
    }
}
