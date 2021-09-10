public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//100までの数字なので、answerに最大値を設定しておく
		int answer = 101;
//数字は５つ与えられるので、iは0-4までの変化をする
		for(int i = 0; i < 5; i++){
//標準入力の値をnに代入する		    
			int n = sc.nextInt();
//nがanswerより小さければansewerにnを入れる
//最終的にanswerに最小値が入る
			if(n < answer){
				answer = n;
			}
		}

		System.out.println(answer);
	}
}