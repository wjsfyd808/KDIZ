package java_day08;

public class Ch03Ex34 {

	static int sum(int a,int b) {
		int c= 0;
		c = a+b;
		
		return c;
	}
	
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		int res = sum(a,b);
System.out.println("a"+"b"+"="+res);
	}

}
