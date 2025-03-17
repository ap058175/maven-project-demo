package gfgamit32;


public class Calculator {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int diff(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return (a*b);
	}
	
	public int div(int a, int b) {
		return (a/b);
	}
	
	public int mod(int a, int b) {
		return (a%b);
	}

	public static void main(String[] args) {
		
    Calculator myCalc=new Calculator();
    System.out.println("Sum is :"+myCalc.sum(20,10));
    System.out.println("Diff is :"+myCalc.diff(20,10));
    System.out.println("mul is :"+myCalc.mul(20,10));
    System.out.println("Div is :"+myCalc.div(20,10));
    System.out.println("Mod is :"+myCalc.mod(20,10));
	}

}

