package day13;

import java.util.*;

//地下迷宫
public class Main2 {
    static  int n , m ,MaxRemainEnergy = 0;
    static  int[][]map;
    static boolean flag = false;
    static  String path = "";
    static LinkedList<String>linkedlist =new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int p =scanner.nextInt();
        map = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                map[i][j] = scanner.nextInt();
            }
        }
        rumMap(0,0,p);

        if(!flag){
            System.out.println("Can not escape");
        }else {
            System.out.println(path);
        }

    }

    private static void rumMap(int x, int y, int energy) {
        if(energy< 0 || x <0 || y < 0|| x>=n || y>=m || map[x][y] != 1){
            return;
        }
        linkedlist.offer("[" + x +"," + y + "]");
        map[x][y] = 0;
        if(x == 0 && y==m-1){
            if(energy> MaxRemainEnergy){
                MaxRemainEnergy = energy;
                undapePath();
            }
            map[x][y] = 1;
            linkedlist.removeLast();
            flag = true;
            return;
        }
        rumMap(x,y+1,energy-1);
        rumMap(x+1,y,energy);
        rumMap(x-1,y,energy-3);
        rumMap(x,y-1,energy-1);
        map[x][y] = 1;
        linkedlist.removeLast();
    }

    private static void undapePath() {
        StringBuffer sb = new StringBuffer();
        Iterator<String> iterator = linkedlist.iterator();
        while(iterator.hasNext()){
            sb.append(iterator.next() +",");
        }
            if(sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }
            path= sb.toString();
    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            int n = scanner.nextInt();
//            int m = scanner.nextInt();
//            int p = scanner.nextInt();
//            int [][]arr =new int[n][m];
//            for(int i = 0 ; i < m ; i++ ){
//                for(int j = 0 ; j < n ; j++){
//                    arr[i][j] = scanner.nextInt();
//                }
//            }
//            int i = 0;
//            int j = 0;
//              List<int[]> list = new ArrayList<>();
//            escapeTheWorld(list,arr,i ,j,p);
//
//        }
//    }
//
//    private static void escapeTheWorld(List<int[]> list, int[][] arr, int i, int j,int p) {
//        if(i < 0 ||  i > arr[0].length -1 || j<0  || j >arr.length-1){
//            return;
//        }
//        if(arr[i][j] == 0){
//            return;
//        }
//        if( p ==0){
//            System.out.println("Can not escape!");
//            return;
//        }
//        list.add(new int[]{i,j});
//        if(i == 0 && j == arr[0].length -1){
//            for(int k = 0 ; k < list.size() ; k++){
//                System.out.println(Arrays.deepToString(new int[][]{list.get(k)}));
//            }
//            return;
//        }
//
//        for( ; i < arr.length -1 ; i++){
//            for( ; j < arr[0].length-1 ; j++){
//                    escapeTheWorld(list,arr,i,j+1,p-1);
//
//                    escapeTheWorld(list,arr,i-3,j,p-3);
//                    escapeTheWorld(list,arr,i+1,j,p);
//            }
//        }
//    }
}
