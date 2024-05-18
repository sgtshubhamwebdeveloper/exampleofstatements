package ex;

public class Swapnumber  {
	public static void main(String[] args) {
		int a=50,b=100;
		System.out.println("Before Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
