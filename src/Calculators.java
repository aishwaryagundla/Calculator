import java.util.Scanner;

public class Calculators {
public static int Addition(int a, int b)
{
	return a+b;
}

public static int Subtraction(int a, int b)
{
	return a-b;
}

public static int Multiplication(int a, int b)
{
	return a*b;
}

public static int Division(int a, int b)
{
	return a/b;
}

public static void main(String args[])
{
	int a = 0, b = 0, k = 0;
	String c;
	System.out.println("Enter A:");
	try (Scanner keyboard = new Scanner(System.in)) {
		a = keyboard.nextInt();
		
		System.out.println("Enter B:");
		b = keyboard.nextInt();
		
		System.out.println("Select operation: \n A: Addition B: Multiplication C: Division D: Subtraction \n");
		c =  keyboard.next();
		System.out.println(a);

		System.out.println(b);
	}
	switch(c)
	{
	case "A":
		k= Addition(a,b);
		break;
	case "B":
		k= Multiplication(a,b);
		break;
	case "C":
		k= Division(a,b);
	break;
	case "D":
		k= Subtraction(a,b);
		break;
	}
	System.out.println("Result:" + k);
}
}