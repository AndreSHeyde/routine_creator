import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class guiClassRunner {
	
	public static ExerciseTable getTable()
	{
		ExerciseTable ret;
		try {
			FileInputStream fis = new FileInputStream("Database.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ret = (ExerciseTable) ois.readObject();
			ois.close();
			fis.close();
			return ret;
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String args[])
	{	
		guiClass window = new guiClass(guiClassRunner.getTable());
		window.display();
		
	}

}
