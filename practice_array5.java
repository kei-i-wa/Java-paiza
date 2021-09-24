// https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__exist

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
            for(int x:a){
                if(x==k){
                    System.out.println("Yes");
                    sc.close();
                    return;
                }
            }
                    System.out.println("No");
                    sc.close();
                }
            }
        


// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = sc.nextInt();

//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         boolean exist = false;
//         for (int x : a) {
//             if (x == k) {
//                 exist = true;
//             }
//         }

//         if (exist) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }
// }