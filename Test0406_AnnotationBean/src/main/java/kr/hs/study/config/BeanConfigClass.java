package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.TestBean;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public Person p1() {
		Person person = new Person("Kim", 30);
		//person.setName("Kim");
		//person.setAge(30);
		return person;
	}
	
	@Bean
	public Person p2() {
		Person person = new Person("Lee", 15);
		//person.setName("Lee");
		//person.setAge(15);
		return person;
	}
	
	@Bean
	public TestBean java1() {
		return new TestBean();
	}
}
