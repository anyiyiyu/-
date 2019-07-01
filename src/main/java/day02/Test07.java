package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String regex="[0-9\\.]+[\\+\\-\\*\\/][0-9\\.]+";
		String temp=scan.next();
		if(temp.matches(regex)){
			int index=0,num=0;
			if(temp.indexOf("+")>=0){
				num=0;
				index=temp.indexOf("+");
			}
			if(temp.indexOf("-")>=0){
				num=1;
				index=temp.indexOf("-");
			}
			if(temp.indexOf("*")>=0){
				num=2;
				index=temp.indexOf("*");
			}
			if(temp.indexOf("/")>=0){
				num=3;
				index=temp.indexOf("/");
			}
			
			String temp1=temp.substring(0, index);
			String temp2=temp.substring(index+1,temp.length());
			double leftNum=Double.parseDouble(temp1);
			double rightNum=Double.parseDouble(temp2);
			double sum=0;
			switch(num){
			case 0:
				sum=leftNum+rightNum;
				System.out.println(temp1+"+"+temp2+"=");
				break;
			case 1:
				sum=leftNum-rightNum;
				System.out.println(temp1+"-"+temp2+"=");
				break;
			case 2:
				sum=leftNum*rightNum;
				System.out.println(temp1+"*"+temp2+"=");
				break;
			case 3:
				sum=leftNum/rightNum;
				System.out.println(temp1+"/"+temp2+"=");
				break;
				
				default:
					System.out.println("错误");
					break;
			}
			String str=String.valueOf(sum);
			String regex1="[0]+";
			if(str.substring(str.indexOf(".")+1).matches(regex1)){
				System.out.println((int)sum);
			}else{
				System.out.println(sum);
			}
		}
		else {
			System.out.println("格式错误");
		}
	}
}
