package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Baseball;
import kr.hs.study.beans.Basketball;
import kr.hs.study.beans.Vollyball;

@Configuration
public class BeanConfigClass {
	@Bean
	public Baseball java1() {
		return new Baseball(9, 9);
	}
	
	@Bean
	public Vollyball java2() {
		Vollyball t1 = new Vollyball();
		t1.setPerssonel(6);
		t1.setSet(3);
		return t1;
	}
	
	@Bean
	public Basketball java3() {
		return new Basketball(5, 4);
	}
}
