package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HelloWorldEn en = ctx.getBean("en", HelloWorldEn.class);
		HelloWorldKr kr = ctx.getBean("kr", HelloWorldKr.class);
		
		en.sayHello();
		kr.sayHello();
		
		ctx.close();
	}

}
