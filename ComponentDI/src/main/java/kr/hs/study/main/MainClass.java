package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		ctx.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx2.getBean("testBean1", TestBean1.class);
		System.out.println("data3: "+ java1.getData3());
		System.out.println("data4: "+ java1.getData4());
		
		TestBean2 java2 = ctx2.getBean("testBean2", TestBean2.class);
		System.out.println("data1: "+ java2.getData1());
		System.out.println("data2: "+ java2.getData2());
		System.out.println("data3: "+ java2.getData3());
		System.out.println("data4: "+ java2.getData4());
		
		ctx2.close();
	}

}
