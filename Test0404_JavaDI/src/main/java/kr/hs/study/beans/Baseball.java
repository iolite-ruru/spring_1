package kr.hs.study.beans;

public class Baseball implements Sports{

	private int perssonel;
	private int set;
	
	public Baseball(int perssonel, int set) {
		this.perssonel = perssonel;
		this.set = set;
	}
	
	public void Play() {
		System.out.print("�߱��� "+ perssonel +"���� ������ ����ϸ�, ");
	}

	public void Stop() {
		System.out.println(set +"ȸ�� �Ǹ� �����.");
	}

}
