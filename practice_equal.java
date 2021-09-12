// import java.util.*;


// public class Main {
//     public static void main(String[] args) {
//         // 自分の得意な言語で
//         // Let's チャレンジ！！
//         Scanner sc = new Scanner(System.in);
//         ArrayList<String> array = new ArrayList<String>();
//         while(sc.hasNextLine()){
//          String data = sc.nextLine();
//          array.add(data);
//         }
//         System.out.println(array.size());
//     }
// }

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if(a.equals(b)){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }