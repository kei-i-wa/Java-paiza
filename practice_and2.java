// import java.util.*;


// public class Main {
//     public static void main(String[] args) {
//         // 自分の得意な言語で
//         // Let's チャレンジ！！
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         if(x%7==0){
//             System.out.println("Sat");
//         }else if((x%7==1)||(x==1)){
//             System.out.println("Sun");
//         }else if((x%7==2)||(x==2)){
//             System.out.println("Mon");
//         }else if((x%7==3)||(x==3)){
//             System.out.println("Tue");
//         }else if((x%7==4)||(x==4)){
//             System.out.println("Wed");
//         }else if((x%7==5)||(x==5)){
//             System.out.println("Thu");
//         }else if((x%7==6)||(x==6)){
//             System.out.println("Fri");
//         }
//     }
// }


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%7==0){
            System.out.println("Sat");
        }else if(x%7==1){
            System.out.println("Sun");
        }else if(x%7==2){
            System.out.println("Mon");
        }else if(x%7==3){
            System.out.println("Tue");
        }else if(x%7==4){
            System.out.println("Wed");
        }else if(x%7==5){
            System.out.println("Thu");
        }else if(x%7==6){
            System.out.println("Fri");
        }
    }
}