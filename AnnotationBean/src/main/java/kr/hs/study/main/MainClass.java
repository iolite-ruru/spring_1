package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/* xml ÆÄÀÏ·Î...
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("data1: "+ obj1.getData1());
		System.out.println("data2: "+ obj1.getData2());
		*/
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("data1: "+ obj2.getData1());
		System.out.println("data2: "+ obj2.getData2());
		System.out.println("*");
		
		TestBean3 obj5 = ctx.getBean("t3", TestBean3.class);
		System.out.println("data1: "+ obj5.getData1());
		System.out.println("data2: "+ obj5.getData2());
		System.out.println("data3: "+ obj5.getData3());
		System.out.println("data4: "+ obj5.getData4());
		
		ctx.close();
		
		System.out.println("=============================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean2 obj3 = ctx2.getBean("java1", TestBean2.class);
		System.out.println("data1: "+ obj3.getData1());
		System.out.println("data2: "+ obj3.getData2());
		System.out.println("*");
		
		TestBean2 obj4 = ctx2.getBean("java2", TestBean2.class);
		System.out.println("data1: "+ obj4.getData1());
		System.out.println("data2: "+ obj4.getData2());
		ctx2.close();
	}

}
