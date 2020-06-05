import java.util.Scanner;

public class StringCalculator {

	public static double multiply (double op1, double op2)
	{
		return (op1*op2);
	}
	
	public static double divide (double op1, double op2)
	{
		return (op1/op2);
	}
	
	public static double minus (double op1, double op2)
	{
		return (op1-op2);
	}
	
	public static double add (double op1, double op2)
	{
		return (op1+op2);
	}
		
		public static void main(String[] args) 
		{
		    Scanner sc;
		    String s;
		    boolean quit=false;
			do
			{
				System.out.print("Enter operation string: ");
				sc = new Scanner(System.in);
				s = sc.nextLine();
			    if (s.contains("+"))
			    {
			    	int index = s.indexOf("+");
			    	//System.out.println("Index = " + index);
			    	double operand1 = Double.valueOf(s.substring(0,index));
			    	double operand2 = Double.valueOf(s.substring(index+1,s.length()));
			    	
			    	double sum = StringCalculator.add(operand1,operand2);
			    	System.out.printf("%8.2f + %8.2f = %8.2f\n", operand1, operand2, sum);
			    	//System.out.println(operand1 + " + " + operand2 + " = " + sum); 			
			    }
			    else if (s.contains("-"))
			    {
			    	int index = s.indexOf("-");
			    	//System.out.println("Index = " + index);
			    	double operand1 = Double.valueOf(s.substring(0,index));
			    	double operand2 = Double.valueOf(s.substring(index+1,s.length()));
			    	
			    	double reduction = StringCalculator.minus(operand1,operand2);
			    	System.out.printf("%8.2f - %8.2f = %8.2f\n", operand1, operand2, reduction);
			    	//System.out.println(operand1 + " - " + operand2 + " = " + reduction);
			    }
			    else if (s.contains("*"))
			    {
			    	int index = s.indexOf("*");
			    	//System.out.println("Index = " + index);
			    	double operand1 = Double.valueOf(s.substring(0,index));
			    	double operand2 = Double.valueOf(s.substring(index+1,s.length()));
			    	
			    	double multiple = multiply(operand1,operand2);
			    	System.out.printf("%8.2f * %8.2f = %8.2f\n", operand1, operand2, multiple);
			    	//System.out.println(operand1 + " * " + operand2 + " = " + multiple);
			    }
			    else if (s.contains("/"))
			    {
			    	int index = s.indexOf("/");
			    	//System.out.println("Index = " + index);
			    	double operand1 = Double.valueOf(s.substring(0,index));
			    	double operand2 = Double.valueOf(s.substring(index+1,s.length()));
			    	if (operand2 != 0)
			    	{
			    		double division = StringCalculator.divide(operand1,operand2);
			    		System.out.printf("%8.2f / %8.2f = %8.2f\n", operand1, operand2, division);
			    		//System.out.println(operand1 + " / " + operand2 + " = " + division);
			    	}
			    	else
			    	{
			    		System.out.println("Error: divide by zero");
			    	}
			    }
			    else 
			    {
			    	quit = true;
			    	System.out.println("quit");
			    }
			} while (quit==false);
		    return;
		}		

	}



		