package kr.hs.study.beans;

public class Vollyball implements Sports{
	private int perssonel;
	private int set;
	
	public Vollyball() {
	}
	
	public void Play() {
		System.out.print("�豸�� "+ perssonel +"���� ������ ����ϸ�, ");
	}

	public void Stop() {
		System.out.println(set +"��Ʈ�� �Ǹ� �����.");
	}

	public int getPerssonel() {
		return perssonel;
	}

	public void setPerssonel(int perssonel) {
		this.perssonel = perssonel;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}
	
}
