package java4;
public class graduate implements student,teacher{
	// graduate类实现student，teacher接口
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	// 实现接口中的抽象方法
	public void setPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
	
	// 实现接口中的抽象方法
	public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
	
	// 实现接口中的抽象方法
	@Override
	public void setFee(double fee) {
		this.fee = fee;
		System.out.println("你的学费设置为：" + this.fee);
	}
	
	// 实现接口中的抽象方法
	public void getFee(double fee) {
		this.fee = fee;
		System.out.println("你的学费为：" + this.fee);
	}
	
	public boolean taxes(){
		if ((this.pay - this.fee) < 5000) {
			System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
			return true;
		}
		System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
		return false;
	}	

}
