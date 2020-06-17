import java.util.ArrayList;

public class ExcerciseTable 
{
	ArrayList<ExcerciseClass>[] excerciseTable;
	
	public ExcerciseTable()
	{
		excerciseTable = new ArrayList[11];
		for (int i = 0; i < 11; i++)
		{
			excerciseTable[i] = new ArrayList<ExcerciseClass>();
		}
	}
	
	public void addExcercise(ExcerciseClass e)
	{
		excerciseTable[e.getPrimMuscle().getLocation()].add(e);
	}
	
	public ArrayList<ExcerciseClass> getList(int i)
	{
		return excerciseTable[i];
	}
	
	public static void main(String[] args)
	{
		ExcerciseClass a = new ExcerciseClass("Pull-Ups", "Pull Yourself Up", MuscleGroup.BACK);
		a.addSuppMuscle(MuscleGroup.BICEPS);
		a.addSuppMuscle(MuscleGroup.SHOULDERS);
		a.addEquipment("Bar");
		//a.printExcercise();
		
		ExcerciseTable table = new ExcerciseTable();
		table.addExcercise(a);
		for (int i = 0; i < 11; i++)
		{
			System.out.println(table.getList(i).toString());
		}
	}


}
