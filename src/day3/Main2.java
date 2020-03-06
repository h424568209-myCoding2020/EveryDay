package day3;
import java.util.Scanner;
//整数与IP地址之间的转换
// 1、ip地址转十进制ip地址，ip地址拆分，每段转二进制，二进制字符串转Long
// 2、十进制ip地址转ip地址：十进制ip地址转二进制字符串，不足32位补位，按照每段八位进行拆分，每段转十进制，拼接成4段组成ip地址
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 始入ip地址字符串
            String ip = scanner.next();
            //输入十进制表示的ip地址字符串
            String nums = scanner.next();
            System.out.println(transip(ip));
            System.out.println(transips(nums));
        }
    }

    //10.0.3.193
    public static long transip(String ip) {
        String[] arr = ip.split("\\.");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            //十进制数转二进制字符串
            sb.append(binaryString(arr[i]));
        }
        return Long.parseLong(sb.toString());
    }

    // 十进制转换为八位二进制
    private static String binaryString(String s) {
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(s);
        //每一位与1 得到八位二进制的字符串
        int k = 1 << 7;
        for (int i = 0; i < 8; i++) {
            int flag = (num & k) == 0 ? 0 : 1;
            sb.append(flag);
            num = num << 1;
        }
        return sb.toString();
    }

    public static String transips(String ip) {
        StringBuffer sb = new StringBuffer();
        // 长整型转二进制字符串
        String ips = Long.toBinaryString(Long.parseLong(ip));
        String as = "";
        //不足32位前补0
        if (ips.length() < 32) {
            for (int i = 0; i < 32 - ips.length(); i++) {
                as += "0";
            }
        }
        ips = as + ips;
        //地址每一段进行拼接
        String[] ipp = new String[4];
        ipp[0] = ips.substring(0, 8);
        ipp[1] = ips.substring(8, 16);
        ipp[2] = ips.substring(16, 24);
        ipp[3] = ips.substring(24);
        for (int i = 0; i < 4; i++) {
            sb.append(Integer.parseInt(ipp[i], 2));
            if (i != 3) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
