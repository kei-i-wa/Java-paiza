// https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__min

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min =100;
        int[]a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int x:a){
            if(x<min){
                min = x ;
            }
        }
        System.out.println(min);
    }
}