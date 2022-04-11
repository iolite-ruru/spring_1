package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TestBean1 {
	@Resource //@Autowired + @Qualifier
	private DataBean1 data1;
	//DataBean1 Ÿ���� bean�� �ִٸ�(bean �̸�:data1) �ڵ�����
	
	@Resource
	private DataBean2 data2;
	
	public TestBean1() {
		System.out.println("�Ű����� ���� ������ ����");
	}
	
	@PostConstruct
	public void PostConstruct() {
		System.out.println("@PostConstruct �޼ҵ� ����");
	}
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("@PreDestroy �޼ҵ� ����");
	}

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
}
