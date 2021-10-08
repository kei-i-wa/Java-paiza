https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_std_in_out_step3

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int x:a){
         System.out.println(x);
        }
        
    }
}

https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_std_in_out_boss

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int a = sc.nextInt() + 1;
            System.out.println(s + " " + a);
        }
    }
}

https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_string_step1


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            System.out.println(a.length());
        }
    }
}