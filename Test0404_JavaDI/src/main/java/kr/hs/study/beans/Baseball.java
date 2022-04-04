package kr.hs.study.beans;

public class Baseball implements Sports{

	private int perssonel;
	private int set;
	
	public Baseball(int perssonel, int set) {
		this.perssonel = perssonel;
		this.set = set;
	}
	
	public void Play() {
		System.out.print("야구는 "+ perssonel +"명의 선수가 경기하며, ");
	}

	public void Stop() {
		System.out.println(set +"회가 되면 멈춘다.");
	}

}
