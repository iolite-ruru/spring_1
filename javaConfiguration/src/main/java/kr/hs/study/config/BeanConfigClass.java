package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration
//자바로 객체를 생성하라고 하는 생성파일
public class BeanConfigClass {
	
	@Bean //아래 나오는 메서드를  실행해서 TestBean1 객체를 만들것이다.
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	@Bean
	public TestBean1 java3() {
		return new TestBean1();
	}
	
	@Bean(name="test")
	@Lazy
	@Scope("prototype")
	public TestBean2 java4() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
}
