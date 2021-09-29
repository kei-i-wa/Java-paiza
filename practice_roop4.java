import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String kaigyou_code_1 = System.lineSeparator();
        int n = sc.nextInt();
        int k = sc.nextInt();
              for(int x=1; x<=k; x++){
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.print(kaigyou_code_1);
        }
    }
}