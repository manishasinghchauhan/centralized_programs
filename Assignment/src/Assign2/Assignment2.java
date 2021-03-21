package Assign2;

public class Assignment2 {
	
	public int sum(int a, int b) {
		int s;
		s=a+b;
		System.out.println("Sum is: "+s);
		return s;		
	}
	public int sub(int d, int e) {
		int su;
		su=d-e;
		System.out.println("Sub is: "+su);
		return su;		
	}
	public int mul(int f, int g) {
		int m;
		m=f*g;
		System.out.println("Mul is: "+m);
		return m;		
	}
	public int div(int h, int i) {
		int di;
		di=h/i;
		System.out.println("Div is: "+di);
		return di;
	}
	public static void main(String[] args) {
		Assignment2 as=new Assignment2();
		int res1=as.sum(10,2);
		int res2=as.sub(res1, 2);
		int res3=as.sum(res2, 2);
		int res4=as.mul(res3, 2);
		int result1=as.div(res4, 2);
		System.out.println("Assignment 1 Result is:" +result1);
		
		int assi1=as.div(10, 2);
		int assi2=as.sum(assi1, 2);
		int assi3=as.sub(assi2, 2);
		int assi4=as.sum(assi3, 2);
		int result2=as.mul(assi4, 2);
		System.out.println("Assignment 2 Result is:" +result2);
	}
}