package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component //이름 없음 == <bean class="..."/>와 같음
public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}
}
