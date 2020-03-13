package day11;

public class Main1 {
    //百万富翁问题
    public static void main(String []args){
        int rich = 0;
        int poor = 0 ;
        for(int i = 0;  i < 30 ; i++){
            rich += 10;
            poor += Math.pow(2,i);
        }
        System.out.println(rich);
        System.out.println(poor);
    }
}
