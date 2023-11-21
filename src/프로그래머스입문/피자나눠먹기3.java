package 프로그래머스입문;

public class 피자나눠먹기3 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int result = s.solution(4, 12);
		System.out.println(result);
	}

}

class Solution7 {
	public int solution(int slice, int n) {
		int answer = 0;
		if (n < slice) {
			answer = 1;
		} else if (n % slice == 0) {
			answer = n / slice;
		} else {
			answer = n / slice + 1;
		}
		return answer;
	}
}
