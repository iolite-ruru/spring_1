package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Person;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Person obj3 = ctx2.getBean(Person.class);
		System.out.println("data1: "+ obj3.getName());
		System.out.println("data2: "+ obj3.getAge());
		ctx2.close();
		
		/*
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		Person obj1 = ctx.getBean("java1", Person.class);
		System.out.println("name: "+ obj1.getName());
		System.out.println("age: "+ obj1.getAge());
		ctx.close();
		*/
	}

}
