// import java.util.*;


// public class Main {
//     public static void main(String[] args) {
//         // 自分の得意な言語で
//         // Let's チャレンジ！！
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             int number = sc.nextInt();
        
//             if(number != 0){
//                 System.out.println("YES");
//             }else{
//                 System.out.println("NO");
//             }
//         }
//     }
// }


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int x : a) {
            if (x == 0) {
                System.out.println("NO");
                sc.close();
                return;
            }
        }

        System.out.println("YES");

        sc.close();
    }
}