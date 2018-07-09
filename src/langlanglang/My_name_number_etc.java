package langlanglang;

import java.util.Arrays;

public class My_name_number_etc {
	
	private int money;
	private String name;
	private String []job;
	
	//인스턴스 변수를 사용하기 위한 접근자 메소드.
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getJob() {
		return job;
	}
	public void setJob(String[] job) {
		this.job = job;
	}
	
	@Override  //인스턴스 변수의 값을 빠르게 확인하기 위한(==디버깅) 메소드
	public String toString() {
		return "My_name_number_etc [money=" + money + ", name=" + name + ", job=" + Arrays.toString(job) + "]";
	}
	
	public My_name_number_etc clone() {
		My_name_number_etc my = new My_name_number_etc();
		my.name = this.name;
		my.job = this.job;
		my.money = this.money;
		
		//my.job = this.job; 데이터를 바꾸지는 못한다.
		//참조형은 다시 복제를 해주어야 합니다.
		my.job = new String[this.job.length];
		for(int i=0; i<job.length; i++)
		{
			my.job[i] = this.job[i];
		}
		
		return my;
	}
	
}
