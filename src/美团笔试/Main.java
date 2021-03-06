package 美团笔试;

import java.util.Scanner;

/**
 * 小美曾经有一个特殊的数组，这个数组的长度为n。但是她在打恐怖游戏的时候被吓得忘记了这个数组长什么样了。不过她还记得这个数组满足一些条件。
 * 首先这个数组的每个数的范围都在L和R之间。包括端点。
 * 除此之外，这个数组满足数组中的所有元素的和是k的倍数。
 * 但是这样的数组太多了，小美想知道有多少个这样的数组。你只需要告诉她在模1e9+7意义下的答案就行了。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n  = scanner.nextInt();
            int k = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int count =0 ;
            for(int i = l ; i<= r ; i++){
                if(i % k == 0){
                    count++;
                }
            }
            System.out.println((int) Math.pow(count,n));
        }
    }
}
