import java.util.* ;
import java.io.*; 
class Person {
	
	// Complete the class
	private String name;
	private int age;

	Person(String name, int age){
		this.name=name;
		this.age=age;

	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}
}

class PrintNameAndAge {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		Person p1 = new Person(name, age);
		System.out.println("The name of the person is "+p1.getName()+" and the age is "+p1.getAge()+".");
	}
}
		
