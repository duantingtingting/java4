package java4;
import java.util.Scanner;

public class taxes {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入你的工资：");
		double i=sc.nextDouble();
		double s=i-5000;
		double j=0;
		if(s>0){
			if(s<=1500){
				j=s*0.03;
			}else if(s<=4500){
				j=s*0.1-105;
			}else if(s<=9000){
				j=s*0.2-555;
			}else if(s<=35000){
				j=s*0.25-1005;
			}else if(s<=55000){
				j=s*0.3-2775;
			}else if(s<=80000){
				j=s*0.35-5505;
			}else {
				j=s*0.45-13505;
			}
			System.out.println("你应交的税为："+j);
		}else{
			System.out.println("不交税！");
			}
	}

}
