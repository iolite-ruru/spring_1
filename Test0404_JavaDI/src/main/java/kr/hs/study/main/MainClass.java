package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Baseball;
import kr.hs.study.beans.Basketball;
import kr.hs.study.beans.Sports;
import kr.hs.study.beans.Vollyball;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Sports obj1 = ctx.getBean("java1", Baseball.class);
		obj1.Play();
		obj1.Stop();
		
		Sports obj2 = ctx.getBean("java2", Vollyball.class);
		obj2.Play();
		obj2.Stop();
		
		Sports obj3 = ctx.getBean("java3", Basketball.class);
		obj3.Play();
		obj3.Stop();
		
		ctx.close();
	}

}
