package 프로그래머스입문;

public class 양꼬치1 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int result = s.solution(44, 6);
		System.out.println(result);
	}

}

class Solution5 {
	public int solution(int n, int k) {
		int total = n / 10;
		int sum = n * 12000 + k * 2000;
//		int sum2 = n* 12000 + (k-total)*2000; 방법 2가지
		return sum - total * 2000;
	}
}