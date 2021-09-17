// https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__sum

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int x:a){
            sum=x+sum;
        }
        System.out.println(sum);
    }
}