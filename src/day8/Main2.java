package day8;

import java.util.Scanner;

public class Main2 {
    public  static int countNumberOf2s(int n) {
        // write code here

        int count =  0;
        int i ;
        if(n < 2 ){
            return 0;
        }
        if(n <= 10){
            return  1;
        }
        for(int j = 2 ; j <= n ; j++){
            i = j ;
            while(i >0){
                if(i%10 ==2) {
                    count++;
                }
                i/=10;
                if( i== 0){
                    break;
                }
            }
        }
        return count;
//        int count = 0 ;
//        int factor = 1;
//        int low = 0;
//        int cur = 0;
//        int high = 0;
//        while(n/factor !=0){
//            low = n-(n/factor) *factor;
//            cur = (n/factor) %10;
//            high = n/(factor*10);
//            switch (cur){
//                case 0:
//                case 1:
//                    cur+=high * factor;
//                    break;
//                case 2:
//                    count += high * factor+low  +1;
//                    break;
//                    default:
//                        count+=(high +1 ) *factor;
//                        break;
//            }
//            factor *= 10;
//        }
//        return count;



//
//        int count = 0, i;
//        if (n < 2) return 0;
//        else if (n <= 10) return 1;
//        else for (int j = 2; j <= n; j++) {
//                i = j;
//                while (i > 0) {
//                    if (i % 10 == 2) count++;
//                    i /= 10;
//                    if (i == 0) break;
//                }
//            }
//        return count;

//
//        int []arr = new int[n];
//        for(int i =0 ; i < n ; i++){
//            arr[i] = i+1;
//        }
//        System.out.println(Arrays.toString(arr));
//        String []res = new String[n];
//        for(int i =0 ; i < n ;i++){
//            res[i] = String.valueOf(arr[i]);
//        }
//        System.out.println(Arrays.toString(res));
//        int count = 0;
//        for(int i =0 ; i < n ; i++){
//            for(int j = 0 ;j < res[i].length() ;j++){
//                char c = res[i].charAt(j);
//                if(c == '2'){
//                    System.out.print(res[i]+" ");
//                    count++;
//                }
//            }
//        }
//        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(countNumberOf2s(n));
        }
    }
}
