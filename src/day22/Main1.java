package day22;

public class Main1 {
    //数组中出现次数超过一半的数字
    public static int MoreThanHalfNum_Solution(int [] array) {
        int count = 1 ;
        int num = array[0];
        for(int i = 1; i < array.length ; i ++){
            if(count == 0){
                count = 1;
                num = array[i];
            }
            if(num == array[i]){
                count ++;
            }else{
                count --;
            }
        }
        int c = 0;
        for(int i = 0 ; i < array.length ; i ++){
            if(array[i] == num){
                c++;
            }
        }
        if(c > array.length /2){
            return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        int []arr = {1,2,2,1,1};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}
