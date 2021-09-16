// https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_step1

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=9){
            System.out.println("1");
        }else if(n<=100){
            System.out.println("2");
        }else if(n<=1000){
            System.out.println("3");
        }else{
            System.out.println("4");
        }
    }
}