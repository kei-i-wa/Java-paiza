{"filter":false,"title":"practice_array7.java","tooltip":"/practice_array7.java","undoManager":{"mark":8,"position":8,"stack":[[{"start":{"row":0,"column":0},"end":{"row":0,"column":88},"action":"insert","lines":["https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__reverse"],"id":1}],[{"start":{"row":0,"column":0},"end":{"row":0,"column":3},"action":"insert","lines":["// "],"id":2}],[{"start":{"row":0,"column":91},"end":{"row":1,"column":0},"action":"insert","lines":["",""],"id":3},{"start":{"row":1,"column":0},"end":{"row":2,"column":0},"action":"insert","lines":["",""]}],[{"start":{"row":2,"column":0},"end":{"row":25,"column":1},"action":"insert","lines":["import java.util.*;","","public class Main {","","    public static void main(String[] args) {","        Scanner sc = new Scanner(System.in);","","        int n = sc.nextInt();","","        int[] a = new int[n];","        for (int i = 0; i < n; i++) {","            a[i] = sc.nextInt();","        }","","        int[] b = new int[n];","        for (int i = 0; i < n; i++) {","            b[i] = a[n - 1 - i];","        }","","        for (int x : b) {","            System.out.println(x);","        }","    }","}"],"id":4}],[{"start":{"row":10,"column":0},"end":{"row":10,"column":1},"action":"insert","lines":["g"],"id":5},{"start":{"row":10,"column":1},"end":{"row":10,"column":2},"action":"insert","lines":["i"]},{"start":{"row":10,"column":2},"end":{"row":10,"column":3},"action":"insert","lines":["t"]}],[{"start":{"row":10,"column":3},"end":{"row":10,"column":4},"action":"insert","lines":[" "],"id":6}],[{"start":{"row":10,"column":3},"end":{"row":10,"column":4},"action":"remove","lines":[" "],"id":7},{"start":{"row":10,"column":2},"end":{"row":10,"column":3},"action":"remove","lines":["t"]},{"start":{"row":10,"column":1},"end":{"row":10,"column":2},"action":"remove","lines":["i"]},{"start":{"row":10,"column":0},"end":{"row":10,"column":1},"action":"remove","lines":["g"]}],[{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["git "],"id":8}],[{"start":{"row":10,"column":3},"end":{"row":10,"column":4},"action":"remove","lines":[" "],"id":9},{"start":{"row":10,"column":2},"end":{"row":10,"column":3},"action":"remove","lines":["t"]},{"start":{"row":10,"column":1},"end":{"row":10,"column":2},"action":"remove","lines":["i"]},{"start":{"row":10,"column":0},"end":{"row":10,"column":1},"action":"remove","lines":["g"]},{"start":{"row":9,"column":29},"end":{"row":10,"column":0},"action":"remove","lines":["",""]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":9,"column":29},"end":{"row":9,"column":29},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1632837428852,"hash":"b7d11d56f45d39b6441f7766a8a5ba48a8ff8400"}