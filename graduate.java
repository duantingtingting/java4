package java4;
public class graduate implements student,teacher{
	// graduate��ʵ��student��teacher�ӿ�
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	// ʵ�ֽӿ��еĳ��󷽷�
	public void setPay(double pay) {
		this.pay = pay * 12;
		System.out.println("���������Ϊ��" + this.pay);
	}
	
	// ʵ�ֽӿ��еĳ��󷽷�
	public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("���������Ϊ��" + this.pay);
	}
	
	// ʵ�ֽӿ��еĳ��󷽷�
	@Override
	public void setFee(double fee) {
		this.fee = fee;
		System.out.println("���ѧ������Ϊ��" + this.fee);
	}
	
	// ʵ�ֽӿ��еĳ��󷽷�
	public void getFee(double fee) {
		this.fee = fee;
		System.out.println("���ѧ��Ϊ��" + this.fee);
	}
	
	public boolean taxes(){
		if ((this.pay - this.fee) < 5000) {
			System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
			return true;
		}
		System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
		return false;
	}	

}
