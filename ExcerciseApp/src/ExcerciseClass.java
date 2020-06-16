import java.util.ArrayList;


public class ExcerciseClass 
{
	String name;
	String description;
	ArrayList<String> bodyParts = new ArrayList<String>();
	
	public ExcerciseClass(String n)
	{
		this.name = n;
	}
	
	public ExcerciseClass(String n, String d)
	{
		this.name = n;
		this.description = d;
	}
	
	public void addDescription(String d)
	{
		this.description = d;
	}
	
	public void addBodyParts(String b)
	{
		this.bodyParts.add(b);
	}
	
	public void printExcercise()
	{
		System.out.println("Excercise: " + this.name +
				           "\nDescription: " + this.description +
				           "\nBody Parts: " + this.bodyParts.toString());

	}
	/*
	public static void main(String[] args)
	{
		ExcerciseClass a = new ExcerciseClass("Pull-Ups");
		a.addDescription("Pull yourself up");
		a.addBodyParts("Arms");
		a.addBodyParts("Back");
		a.printExcercise();
	}*/
}
