package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//config.xml������ �о �޸𸮷� �ε��Ͽ� ��ü�� ������ ���� �����̳ʿ� ����
		TestBean t1 = (TestBean)ctx.getBean("t1"); //getBean==object  �ٿ�ĳ����
		System.out.println("t1: "+t1);
		
		TestBean t2 = ctx.getBean("t2", TestBean.class); //������ Ŭ���� ���� ���
		System.out.println("t2: "+t2);
		ctx.close(); // container ����
	}

}
