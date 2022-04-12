package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class BeanConfigClass {
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean4 data4() {
		return new DataBean4();
	}
	
	@Bean
	public TestBean1 testBean1() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean2 testBean2() {
		return new TestBean2();
	}
}
