package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/*
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("obj1: " + obj1);

		TestBean1 obj2 = ctx.getBean("t1", TestBean1.class);
		System.out.println("obj2: " + obj2);

		TestBean1 obj3 = ctx.getBean("t2", TestBean1.class);
		System.out.println("obj3: " + obj3);
		
		TestBean1 obj4 = ctx.getBean("t2", TestBean1.class);
		System.out.println("obj4: " + obj4);
		*/
		TestBean1 obj5 = ctx.getBean("t3", TestBean1.class); //init method »£√‚
		System.out.println("obj5: " + obj5);
		
		ctx.close();
	}

}
