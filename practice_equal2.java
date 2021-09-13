// import java.util.*;


// public class Main {
//     public static void main(String[] args) {
//         // 自分の得意な言語で
//         // Let's チャレンジ！！
//         Scanner sc = new Scanner(System.in);
//         String line = sc.nextLine();
//         if(line == "paiza"){
//             System.out.println("YES");
//         }else{
//             System.out.println("NO");
//         }
//     }
// }

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        if (s.equals("paiza")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();