// https://paiza.jp/works/mondai/conditions_branch/conditions_branch__simple_step3
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a * b <= c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}