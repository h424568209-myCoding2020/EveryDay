package day24;

/**
 * 顺时针打印矩阵
 */
public class Main2 {
    public int [] clocjwisePrint(int [][]mat , int n ,int m ){
        int []a = new int[m*n];
        if(mat == null){
            return a;
        }
        int i = 0, j = 0 , k = 0 , startX = 0,startY= 0 ,endX= n-1,endY= m-1;
        while(startX <=endX && startY <=endY){
            if(startX == endX){
                for(; j <=endY ; j++,k++){
                    a[k] = mat[startX][j];
                }
                return a;
            }
            if(startY == endY){
                for(; i<=endY ;i++,k++){
                    a[k] = mat[i][startY];
                }
                return a;
            }
            for( ; j< endY ; j++){
                a[k++] = mat[i][j];
            }
            for(;i < endX ; i++){
                a[k++] = mat[i][j];
            }
            for(; j >startX ; j--){
                a[k++] = mat[i][j];
            }
            for(; i >startY ; i--){
                a[k++] = mat[i][j];
            }
            i++;
            j++;
            startX++;
            startY++;
            endX--;
            endY--;
        }
        return a;
    }
}
