// https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__max

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for(int i=0; i<n; i++){
           int k = sc.nextInt();
           if(k>=max){
               max=k;
           }
        }
        System.out.println(max);
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = 0;
        for (int x : a) {
            if (max < x) {
                max = x;
            }
            // 上の if 文の箇所は以下のように書いても解けます(詳しくは解説で)
            // max = Math.max(max, x);

        }

        System.out.println(max);
    }
}