package kr.hs.study.beans;

public class Basketball implements Sports{

	private int perssonel;
	private int set;
	
	public Basketball(int perssonel, int set) {
		this.perssonel = perssonel;
		this.set = set;
	}
	
	public void Play() {
		System.out.print("�󱸴� "+ perssonel +"���� ������ ����ϸ�, ");
	}

	public void Stop() {
		System.out.println(set +"���Ͱ� �Ǹ� �����.");
	}

}
