package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TestBean1 {
	@Resource //@Autowired + @Qualifier
	private DataBean1 data1;
	//DataBean1 타입의 bean이 있다면(bean 이름:data1) 자동주입
	
	@Resource
	private DataBean2 data2;
	
	public TestBean1() {
		System.out.println("매개변수 없는 생성자 실행");
	}
	
	@PostConstruct
	public void PostConstruct() {
		System.out.println("@PostConstruct 메소드 실행");
	}
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("@PreDestroy 메소드 실행");
	}

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
}
