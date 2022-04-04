package kr.hs.study.beans;

public class Basketball implements Sports{

	private int perssonel;
	private int set;
	
	public Basketball(int perssonel, int set) {
		this.perssonel = perssonel;
		this.set = set;
	}
	
	public void Play() {
		System.out.print("농구는 "+ perssonel +"명의 선수가 경기하며, ");
	}

	public void Stop() {
		System.out.println(set +"쿼터가 되면 멈춘다.");
	}

}
