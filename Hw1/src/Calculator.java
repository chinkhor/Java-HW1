import java.util.Scanner;

public class Calculator {
	
	public double multiply (double op1, double op2)
	{
		return (op1*op2);
	}
	
	public double divide (double op1, double op2)
	{
		return (op1/op2);
	}
	
	public double minus (double op1, double op2)
	{
		return (op1-op2);
	}
	
	public double add (double op1, double op2)
	{
		return (op1+op2);
	}

	public static void main(String[] args) {
		
		System.out.print("Enter operation string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while (!s.contentEquals("q"))
		{
		    if (s.contains("+"))
		    {
		    	int index = s.indexOf("+");
		    	//System.out.println("Index = " + index);
		    	double operand1 = Double.valueOf(s.substring(0,index));
		    	double operand2 = Double.valueOf(s.substring(index+1,s.length()));
		    	
		    	Calculator c = new Calculator();
		    	double sum = c.add(operand1,operand2);
		    	System.out.printf("%8.2f + %8.2f = %8.2f\n", operand1, operand2, sum);
		    	//System.out.println(operand1 + " + " + operand2 + " = " + sum); 			
		    }
		    else if (s.contains("-"))
		    {
		    	int index = s.indexOf("-");
		    	//System.out.println("Index = " + index);
		    	double operand1 = Double.valueOf(s.substring(0,index));
		    	double operand2 = Double.valueOf(s.substring(index+1,s.length()));
		    	
		    	Calculator c = new Calculator();
		    	double reduction = c.minus(operand1,operand2);
		    	System.out.printf("%8.2f - %8.2f = %8.2f\n", operand1, operand2, reduction);
		    	//System.out.println(operand1 + " - " + operand2 + " = " + reduction);
		    }
		    else if (s.contains("*"))
		    {
		    	int index = s.indexOf("*");
		    	//System.out.println("Index = " + index);
		    	double operand1 = Double.valueOf(s.substring(0,index));
		    	double operand2 = Double.valueOf(s.substring(index+1,s.length()));
		    	
		    	Calculator c = new Calculator();
		    	double multiply = c.multiply(operand1,operand2);
		    	System.out.printf("%8.2f * %8.2f = %8.2f\n", operand1, operand2, multiply);
		    	//System.out.println(operand1 + " * " + operand2 + " = " + multiply);
		    }
		    else if (s.contains("/"))
		    {
		    	int index = s.indexOf("/");
		    	//System.out.println("Index = " + index);
		    	double operand1 = Double.valueOf(s.substring(0,index));
		    	double operand2 = Double.valueOf(s.substring(index+1,s.length()));
		    	
		    	Calculator c = new Calculator();
		    	double divide = c.divide(operand1,operand2);
		    	System.out.printf("%8.2f / %8.2f = %8.2f\n", operand1, operand2, divide);
		    	//System.out.println(operand1 + " / " + operand2 + " = " + divide);
		    }
		    else 
		    {
		    	System.out.println("Other mode");
		    }
		    System.out.print("Enter operation string: ");
			sc = new Scanner(System.in);
			s = sc.nextLine();
		}
	    return;
	}

}
