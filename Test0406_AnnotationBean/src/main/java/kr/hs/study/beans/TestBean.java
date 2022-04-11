package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean {
	@Autowired
	@Qualifier("p1")
	private Person p1;
	
	@Autowired	
	@Qualifier("p2")
	private Person p2;
	
	public String getP1Name() {
		return p1.getName();
	}
	public int getP1Age() {
		return p1.getAge();
	}
	
	public String getP2Name() {
		return p2.getName();
	}
	public int getP2Age() {
		return p2.getAge();
	}
}
