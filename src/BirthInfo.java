import java.util.Scanner;

public class BirthInfo {
	
	public static void  main(String[] args){

	String name;
	int yearBorn = (); 
	
	Scanner input = new Scanner(System.in);
	
	System.out.printf("What is your name?");
	name = input.next();
	
	System.out.printf("What is your birth year?");
	yearBorn = input.next();
	
	int age = (2015);
	System.out.printf("You are %d years old\n");
	
	if (age>=21) {
	System.out.println("you can drink");}
	
	else if (age<=21) {
	System.out.println("you can't drink");
	}
}