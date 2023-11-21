package 프로그래머스입문;

import java.util.Scanner;

public class 두수의나눗셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Solution3 s = new Solution3();
		int result = s.solution(num1, num2); // 200
		System.out.println(result);
		sc.close();
	}

}

class Solution3 {
	public int solution(int num1, int num2) {
		int answer = 0;
		// 나누기 연산시 소수점을 살려야하기 때문에
		// 최소한 하나의 값을 double로 변경.
		double result = (double) num1 / num2;
		// 나눗셈 한 나머지까지 살리고 싶으면 double로 해줘야 함.
		System.out.println(result);
		result = result * 1000;
		System.out.println(result);
		System.out.println((int)result);
		answer = (int)result;
		return answer;
	}
}