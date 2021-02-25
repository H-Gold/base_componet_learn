package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			if(n<1) {
				System.out.println("输入错误");
			}else {
				for(int i=1;i<=n;i++) {
					 for(int j=1;j<=i;j++) {
						 System.out.print(i+"*"+j+"="+i*j+"\t");
					 }
					 System.out.println();
				 }
			}
		} 
	}
}


/*月份翻译
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); while(scanner.hasNext()) { int m = scanner.nextInt();
 * if(m==1) { System.out.println("January"); }else if(m==2) {
 * System.out.println("February"); }else if(m==3) { System.out.println("March");
 * }else if(m==4) { System.out.println("April"); }else if(m==5) {
 * System.out.println("May"); }else if(m==6) { System.out.println("June"); }else
 * if(m==7) { System.out.println("July"); }else if(m==8) {
 * System.out.println("August"); }else if(m==9) {
 * System.out.println("September"); }else if(m==10) {
 * System.out.println("October"); }else if(m==11) {
 * System.out.println("November"); }else if(m==12) {
 * System.out.println("December"); }else { System.out.println("输入错误"); } } }
 */
//一元二次方程
/*
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); DecimalFormat df = new DecimalFormat("0.00");
 * while(scanner.hasNext()) { double a = scanner.nextDouble(); double b =
 * scanner.nextDouble(); double c = scanner.nextDouble(); double m = b*b-4*a*c;
 * if(m>0) {
 * System.out.println("The equation has two roots "+df.format(((-b)+(Math.sqrt(m
 * )))/(2*a))+" and "+df.format(((-b)-(Math.sqrt(m)))/(2*a))); }else if(m==0) {
 * System.out.println("The equation has one root "+df.format((-b)/(2*a))); }else
 * { System.out.println("The equation has no real roots"); } } }
 */

/*成绩
public static void main(String[] args) { 
	Scanner scanner = new Scanner(System.in); 
	while(scanner.hasNext()) {
		int score = scanner.nextInt(); 
		if (score >= 90) { 
			System.out.println("A"); 
		} else if (score >= 80) {
			System.out.println("B"); 
		} else if (score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60) {
			System.out.println("D"); 
		}else{
			System.out.println("E"); } 
	}
	scanner.close();
}*/

/*判断闰年
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in);
 * 
 * while(scanner.hasNext()) { int year = scanner.nextInt();
 * if(year%4==0&&year%100!=0||year%400==0){ System.out.println(1); }else{
 * System.out.println(0); } } }
 */
//阶乘
/*
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); int n = scanner.nextInt(); int sum=0,num=1; for(int
 * i=1;i<=n;i++) { num*=i; sum+=num; } System.out.println(sum); }
 */
//条件输出
/*
 * public static void main(String[] args) { DecimalFormat df = new
 * DecimalFormat("0.00"); Scanner scanner = new Scanner(System.in); double x =
 * scanner.nextDouble(); if(x<1) { System.out.println(df.format(x)); }else
 * if(x>=10) { System.out.println(df.format(3*x-11)); }else {
 * System.out.println(df.format(2*x-1)); } }
 */

//三个数排序
/*
 * public static void main(String[] args) { Scanner sc=new Scanner(System.in);
 * int i=sc.nextInt(); int j=sc.nextInt(); int k=sc.nextInt(); int max=(i>j?
 * i:j)>k? (i>j? i:j):k; int min=(i<j? i:j)<k? (i<j? i:j):k;
 * System.out.println(max+" "+(i+j+k-max-min)+" "+min); }
 */

//温度转换
/*
 * public static void main(String[] args) { DecimalFormat df = new
 * DecimalFormat("0.00"); Scanner in = new Scanner(System.in); double F; double
 * C = in.nextInt(); F = 32+C*9/5; System.out.println(df.format(F)); in.close();
 * }
 */