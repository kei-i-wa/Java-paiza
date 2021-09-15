//https://paiza.jp/works/mondai/conditions_branch/conditions_branch__mod_step3
// import java.util.*;


// public class Main {
//     public static void main(String[] args) {
//         // 自分の得意な言語で
//         // Let's チャレンジ！！
//         Scanner sc = new Scanner(System.in);
//         int odd = 0;
//         int even = 0;
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             int i = sc.nextInt();
//             if(i%2==0){
//                 even = even + 1;
//             }else{
//                 odd = odd + 1;
//             }
//         }
//         System.out.print(even);
//         System.out.print(odd);
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

        int even = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                even += 1;
            }
        }
        System.out.println(even + " " + (n - even));

        sc.close();
    }
}