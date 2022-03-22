package kr.hs.study.main;
import kr.hs.study.HelloWorldEn;
import kr.hs.study.HelloWorldKo;
import kr.hs.study.Hello;

public class MainClass {

	public static void main(String[] args) {
		Hello hello = new HelloWorldKo();
		say_Method(hello);
	}
	public static void say_Method(Hello	hello){
		hello.sayHello();
	}
}