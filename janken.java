// じゃんけんプログラム

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 標準入力から1行取得 グー,チョキ,パー
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] array = data.split(",");
        double rand = Math.random()*array.length;
        int num = (int)rand;

        // ランダムに選んだ配列の要素を出力
        System.out.println(array[num]);
        
    }
}
