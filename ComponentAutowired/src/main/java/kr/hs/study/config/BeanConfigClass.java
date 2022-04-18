package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfigClass {

	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean4 data4() {
		return new DataBean4();
	}
	/*
	@Bean
	public TestBean3 test1() {
		return new TestBean3(null, null);
	}
	*/
	
}
