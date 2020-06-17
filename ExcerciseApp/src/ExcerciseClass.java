import java.util.ArrayList;


public class ExcerciseClass implements java.io.Serializable
{
	String name;
	String description;
	MuscleGroup primaryMuscle;
	ArrayList<MuscleGroup> supportingMuscle = new ArrayList<MuscleGroup>();
	ArrayList<String> equipment = new ArrayList<String>();
	
	//Creates Excercise with Name, Description, and Muscle group
	public ExcerciseClass(String n, String d, MuscleGroup m)
	{
		this.name = n;
		this.description = d;
		this.primaryMuscle = m;
	}
	
	//Get Name of excercise
	public String getName()
	{
		return this.name;
	}
	
	//Update name, returns old name
	public String changeName(String n)
	{
		String ret = this.name;
		this.name = n;
		return ret;
	}
	
	//Get Description of Excercise
	public String getDescription()
	{
		return this.description;
	}
	
	//Update description, returns old description
	public String changeDescription(String d)
	{
		String ret = this.description;
		this.description = d;
		return ret;
	}
	
	//Get Muscle Group of Excercise
	public MuscleGroup getPrimMuscle()
	{
		return this.primaryMuscle;
	}
	
	//Update primary muscle group, returns old muscle group
	public MuscleGroup changePrimMuscle(MuscleGroup m)
	{
		MuscleGroup ret = this.primaryMuscle;
		this.primaryMuscle = m;
		return ret;
	}
	
	
	//Adds supporting muscle group
	public void addSuppMuscle(MuscleGroup m)
	{
		this.supportingMuscle.add(m);
	}
	
	//Adds equipment
	public void addEquipment(String e)
	{
		this.equipment.add(e);
	}
	
	public void printExcercise()
	{
		System.out.println("Excercise: " + this.name +
				           "\nDescription: " + this.description +
				           "\nPrimary Muscle: " + this.primaryMuscle.toString() +
				           "\nSupporting Muscle: " + this.supportingMuscle.toString() +
						   "\nEquipment: " + this.equipment.toString());

	}
	public static void main(String[] args)
	{
		
		ExcerciseClass a = new ExcerciseClass("Pull-Ups", "Pull Yourself Up", MuscleGroup.BACK);
		a.addSuppMuscle(MuscleGroup.BICEPS);
		a.addSuppMuscle(MuscleGroup.SHOULDERS);
		a.addEquipment("Bar");
		a.printExcercise();
	}
}
