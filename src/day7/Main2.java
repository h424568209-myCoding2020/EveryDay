    package day7;

    import java.util.*;

    public class Main2 {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            while(scanner.hasNext()){
                String path = scanner.next();
                int n = scanner.nextInt();
                int nameid = path.lastIndexOf('\\');
                String name = path.substring(nameid+1);
                LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
                String k = name+" "+n;
                if(map.containsValue(k)){
                    map.put(k,map.get(k)+1);
                }else{
                    map.put(k,1);
                }
                List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
                list.sort(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        if(o2.getValue()  - o1.getValue() == 0){
                            return  o1.getValue()  - o2.getValue();
                        }
                        return o2.getValue() - o1.getValue();
                    }
                });
                int count = 0;
                for(Map.Entry<String,Integer> m : list){
                    count++;
                    if(count >8){
                        break;
                    }
                    String []str = m.getKey().split(" ");
                    String url = str[0];
                    if(url.length() > 16){
                        url = url.substring(url.length()-16);
                    }
                    String value = str[1];
                    System.out.println(url +" "+ value + m.getValue());
                }
            }
            scanner.close();
        }
    }
