package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

//Ⱦ�� ���ɻ簡 �� Ŭ����
public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod ȣ��");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod ȣ��");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundMethod ȣ��");
		pjp.proceed(); //���� ����Ͻ� ���� ȣ��(method1())
		System.out.println("aroundMethod ȣ��2");
	}
	
	public void afterReturning(){
		System.out.println("afterReturning Method ȣ��");
	}
	
	public void afterThrowing(Throwable e){
		System.out.println("afterThrowable ȣ��");
		System.out.println("e: "+ e);
	}
}
