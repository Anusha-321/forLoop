package forLoopDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class arrayOfString {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
            int n;
            System.out.println("Enter the size of array:" );
            n= obj.nextInt();
            String[] name= new String[n];
            ReadStringArray(name);
            PrintStringArray(name);
            GroupArray(name);
            GroupArrayByMap(name);
        }

        private static void GroupArrayByMap(String[] name) {
            Map<String, Integer> count = new HashMap<>();
            for (String S : name) {
                if(count.containsKey(S)){
                    count.put(S, count.get(S)+1);
                }
                else{
                    count.put(S,1);
                }
            }
            System.out.println(count);
        }
        private static void GroupArray(String[] name) {
            int k = 0;
            for (int i = 0; i < name.length; i++) {

                for (int j = i + 1; j < name.length; j++) {
                    if (Objects.equals(name[i], name[j])) {
                        k++;

                    }
                    System.out.println(name[i] + "=" + k);
                }
            }
        }

        private static void PrintStringArray(String[] name) {
            for (String s : name) {
                System.out.println("Given Name:" + s);

            }
        }

        private static void ReadStringArray(String[] name) {
            Scanner obj=new Scanner(System.in);
            for(int i=0;i<name.length;i++){
                System.out.println("Enter names:");
                name[i]= obj.next();
            }
    }
}


