package  day18;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            String s1 = in.nextLine();

            String s2 = in.nextLine();

            encrypt(s1);

            unEncrypt(s2);

        }

    }

    public static void encrypt(String s){

        StringBuffer str = new StringBuffer();

        for(int i = 0;i<s.length();i++){

            if(s.charAt(i)>=97){

                str.append((char)((s.charAt(i)-97+1) %26+65));

            }else if(s.charAt(i)>=65){

                str.append((char)((s.charAt(i)-65+1) %26+97));

            } else{

                str.append((char)((s.charAt(i)-48+1) %10+48));

            }

        }

        System.out.println(str);

    }

    public static void unEncrypt(String s){

        StringBuffer str = new StringBuffer();

        for(int i = 0;i<s.length();i++){

            if(s.charAt(i)>=97){

                if(s.charAt(i)=='a'){

                    str.append('Z');

                }else{

                    str.append((char)((s.charAt(i)-97-1) %26+65));

                }

            } else if(s.charAt(i)>=65){

                if(s.charAt(i)=='A'){

                    str.append('z');

                }else{

                    str.append((char)((s.charAt(i)-65-1) %26+97));

                }

            }else{

                if(s.charAt(i) == '0'){

                    str.append('9');

                }else{

                    str.append((char)((s.charAt(i)-48-1) %10+48));

                }

            }

        }

        System.out.println(str);

    }

}


