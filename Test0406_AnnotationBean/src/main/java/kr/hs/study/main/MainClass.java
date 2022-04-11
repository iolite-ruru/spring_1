package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean obj1 = ctx.getBean("java1", TestBean.class);
		System.out.println(obj1.getP1Name() +", "+ obj1.getP1Age());
		System.out.println(obj1.getP2Name() +", "+ obj1.getP2Age());
		
		ctx.close();
	}

}
