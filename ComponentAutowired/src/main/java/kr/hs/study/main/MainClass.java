package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {		
		
		/*
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean3 obj3 = ctx2.getBean("test3", TestBean3.class);
		System.out.println("data1: "+ obj3.getData1());
		System.out.println("data2: "+ obj3.getData2());
		System.out.println("data3: "+ obj3.getData3());
		System.out.println("data4: "+ obj3.getData4());
		ctx2.close();
		*/
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
/*
		TestBean3 obj1 = ctx.getBean("test1", TestBean3.class);
		System.out.println("data1: "+ obj1.getData1());
		System.out.println("data2: "+ obj1.getData2());
		System.out.println("data3: "+ obj1.getData3());
		System.out.println("data4: "+ obj1.getData4());
*/
		TestBean3 obj2 = ctx.getBean( TestBean3.class);
		System.out.println("data1: "+ obj2.getData1());
		System.out.println("data2: "+ obj2.getData2());
		System.out.println("data3: "+ obj2.getData3());
		System.out.println("data4: "+ obj2.getData4());
		
		ctx.close();
	}

}
