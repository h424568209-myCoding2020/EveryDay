package day18;

import java.util.Scanner;

//计算日期到天数转换
public class Main1 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int d = iConverDateToDay(year,month,day);
            System.out.println(d);
        }
    }
    public static int iConverDateToDay(int year,int month , int day){
        int sum = 0;
        if(month <=0 || month >12){
            return -1;
        }
        if( day >31){
            return -1;
        }
        //闰年

        if(year %4 == 0 && year % 100 != 0 ){
            for(int i = 1; i < month ; i++){
                if(i == 2){
                    sum += 29;
                }else if( i == 1|| i==3||i==5||i==7||i==8||i==10||i==12){
                    sum += 31;
                }else {
                    sum += 30;
                }
            }
            sum += day;
            return sum;
        }else{
            for(int i = 1; i < month ; i++){
                if(i == 2){
                    sum += 28;
                }else if( i == 1|| i==3||i==5||i==7||i==8||i==10||i==12){
                    sum += 31;
                }else{
                    sum += 30;
                }
            }
            sum +=day;
            return sum;
        }
    }
}
