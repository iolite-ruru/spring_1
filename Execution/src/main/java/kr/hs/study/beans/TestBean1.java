package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1 ȣ��");
	}
	
	public void method1(int a) {
		System.out.println("method1(int) ȣ��: " + a);
	}
	
	public void method1(int a, int b) {
		System.out.println("method1(int, int) ȣ��: " + a + ", "+ b);
	}
	
	public void method1(String a) {
		System.out.println("method1(String) ȣ��: " + a);
	}

	
	public void method1(int a, String b) {
		System.out.println("method1(int, String) ȣ��: " + a + ", "+ b);
	}
	
	public void method2() {
		System.out.println("method2 ȣ��");
	}
	
	public int method3() {
		System.out.println("int method3 ȣ��");
		return 0;
	}
}
