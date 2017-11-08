package Data;

public class PID {
	private String name;
	private double time;        //运行时间
	private int weight;      //权值
	private char ch;        //进程的优先权使用字母的ASCII码来比较，ASCII越大的优先级越高。
	private  String status;        //进程的状态
	
	//指针
	public PID(){};
	
	public PID(String name,double time,int weight,String status)
	{
		setName(name);
		setTime(time);
		setWeight(weight);
		setStatus(status);
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTime() {
		return (long) time;
	}
	public void setTime(double time2) {
		this.time = time2;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	
}
