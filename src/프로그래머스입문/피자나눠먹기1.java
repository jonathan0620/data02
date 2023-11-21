package 프로그래머스입문;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int result = s.solution(15);
		System.out.println(result);
	}

}

class Solution6 {
	public int solution(int n) {
		int answer = 0;
		int slice = 7;
		if (n < slice) {
			answer = 1;
		} else if (n % 7 == 0) {
			answer = n / 7;
		} else {
			answer = n / 7 + 1;
		}
		return answer;
	}
}
