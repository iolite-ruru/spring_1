package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1 호출");
	}
	
	public void method1(int a) {
		System.out.println("method1(int) 호출: " + a);
	}
	
	public void method1(int a, int b) {
		System.out.println("method1(int, int) 호출: " + a + ", "+ b);
	}
	
	public void method1(String a) {
		System.out.println("method1(String) 호출: " + a);
	}

	
	public void method1(int a, String b) {
		System.out.println("method1(int, String) 호출: " + a + ", "+ b);
	}
	
	public void method2() {
		System.out.println("method2 호출");
	}
	
	public int method3() {
		System.out.println("int method3 호출");
		return 0;
	}
}
