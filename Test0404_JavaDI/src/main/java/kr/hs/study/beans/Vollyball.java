package kr.hs.study.beans;

public class Vollyball implements Sports{
	private int perssonel;
	private int set;
	
	public Vollyball() {
	}
	
	public void Play() {
		System.out.print("배구는 "+ perssonel +"명의 선수가 경기하며, ");
	}

	public void Stop() {
		System.out.println(set +"세트가 되면 멈춘다.");
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
