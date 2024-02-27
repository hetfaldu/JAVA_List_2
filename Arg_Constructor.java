import java.util.*;
public class Arg_Constructor
{
	public static void main(String []  args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Your Name :: ");
		String n = sc.nextLine();
		System.out.print("Your Age :: ");	
		int a = sc.nextInt();
		person obj = new person(n,a);
	}
}
class person
{
	person (String n,int a)
	{
		String name = n;
		int age = a;
		System.out.println("Your Name :: "+name);
		System.out.println("Your Age :: "+age);
	}	
}
