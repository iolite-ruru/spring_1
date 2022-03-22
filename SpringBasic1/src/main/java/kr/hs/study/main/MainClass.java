package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//config.xml파일을 읽어서 메모리로 로딩하여 객체를 생성하 ㄴ후 컨테이너에 보냄
		TestBean t1 = (TestBean)ctx.getBean("t1"); //getBean==object  다운캐스팅
		System.out.println("t1: "+t1);
		
		TestBean t2 = ctx.getBean("t2", TestBean.class); //가져올 클래스 형태 명시
		System.out.println("t2: "+t2);
		ctx.close(); // container 종료
	}

}
