
public class Calculator {
	int a,b;
    public void addition()
    {
    	a=10;
    	b=20;
    	System.out.println("Addition of Numbers : "+(a+b));
    }
    
    public void subtraction()
    {
    	a=50;
    	b=35;
    	System.out.println("Subtraction of Numbers : "+(a-b));
    }
    public void multiplication()
    {
    	a=10;
    	b=20;
    	System.out.println("Multiplication of Numbers : "+(a*b));
    }
    public void division()
    {
    	a=60;
    	b=2;
    	System.out.println("Quotient of Numbers : "+(a/b));
    	System.out.println("Remender of numbers : "+(a%b));
    }
	
    public static void main(String[] args) {

    	Calculator c=new Calculator();
    	
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
		
		
	}
}