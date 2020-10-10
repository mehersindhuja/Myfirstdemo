import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Employee x=new Employee();
		x.getInput();
		x.display();
	}
}
class Employee
{
	String name;
	int age;
	String city;
	public void getInput()
	{
		System.out.println("Enter your Name, Age, and City");
		Scanner kb = new Scanner(System.in);
		name=kb.next();
		age=kb.nextInt();
		city=kb.next();
	}
	public void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
	}
	
}


