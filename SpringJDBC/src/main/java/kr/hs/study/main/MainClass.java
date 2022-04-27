package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestDAO dao = ctx.getBean(TestDAO.class);
		
//		TestBean bean1 = new TestBean();
//		bean1.setData1(100);
//		bean1.setData2("spring100");
//		TestBean bean2 = new TestBean();
//		bean2.setData1(200);
//		bean2.setData2("spring200");
		
//		dao.insert_data(bean1);
//		dao.insert_data(bean2);
//		System.out.println("Inserted!");
		
		
//		TestBean bean3 = new TestBean();
//		bean3.setData1(100);
//		bean3.setData2("testtest");
//		
//		dao.update_data(bean3);
//		System.out.println("Updated!");
		
		
		TestBean bean4 = new TestBean();
		bean4.setData1(200);
		bean4.setData2("testtest");
		
		dao.delete_data(bean4.getData1());
		System.out.println("Deleted!");

		ctx.close();
	}

}
