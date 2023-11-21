package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션구문 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add(1000);
		System.out.println(bag);
		//bag-주소가 들어가 있음 
		//Hashset에 toString()이 들어있어서
		//주소말고 hashset에 들어있는 값들을 String
		System.out.println(bag.size());
		
		ArrayList list = new ArrayList();
		list.add("코딩수업");
		list.add(2);
		System.out.println(list);
		String s = (String)list.get(0);
		int time = (int)list.get(1);
		System.out.println(time + 1);
		
		//<타입클래스명>은 객체 생성할 때 결정 가능
		ArrayList<String> name = new ArrayList<String>();
		name.add("홍길동");
		name.add("김길동");
		String s2 = name.get(0);
		
		ArrayList<Integer> food = new ArrayList<Integer>();
		food.add(18000);
		food.add(12000);
		int in = food.get(0);
		food.add(0, 10000); //오버로딩 (다형성)
		//자바에서 입력형태가 다르면 메서드 이름 동일하게 써도 됨.
		boolean result = food.contains(12000);
		System.out.println(result);
		int in2 = food.indexOf(12000);
		System.out.println(in2);
		boolean result2 = food.isEmpty();
		System.out.println(result2);
		int in3 = food.lastIndexOf(10000);
		System.out.println(in3);
		food.set(0, 11000);
		System.out.println(food);
		
		Object[] arr = food.toArray();
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		food.clear();
		System.out.println(food);
		
		HashMap<Integer, String> tel = new HashMap<>();
		tel.put(1, "엄마");
		tel.put(2, "친구");
		System.out.println(tel);
	}

}
