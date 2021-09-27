// https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__reverse

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[n - 1 - i];
        }

        for (int x : b) {
            System.out.println(x);
        }
    }
}