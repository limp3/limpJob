package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test{

	public static void main(String ... args){
		
		Test test = new Test();
		test.call();
		test.call2();
		test.call3();
	}

	Test_Interface ti = (int a, int b) -> a + b;

	private void call(){
		System.out.println(ti.calc(1, 3));
	}
	
	private void call2() {
		System.out.println("AAA");
	}
	
	
	String[] arr = new String[]{"넷", "둘", "셋", "하나"};

	
	 

	// 배열에서 스트림 생성
	private void call3() {
		Stream<String> str = Arrays.stream(arr);
		
		List<String> list = new ArrayList<String>();
		
		str.forEach(
			e -> list.add(e)
		);
		
		list.stream()
		.filter(s -> s.startsWith(""))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::print);
	
		System.out.println();
		System.out.println(list.size());
		
		
	}
}
