package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfigClass {
	/*
	@Bean
	public Person java1() {
		return new Person();
	}
	*/
}
