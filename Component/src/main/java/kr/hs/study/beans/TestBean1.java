package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component //�̸� ���� == <bean class="..."/>�� ����
public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1�� �⺻������");
	}
}
