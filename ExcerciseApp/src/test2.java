import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test2 {

	public static void main(String[] args) {
		ExerciseTable a = new ExerciseTable();
		ExerciseTable b = new ExerciseTable();
		
		try {
			FileInputStream fis = new FileInputStream("Database.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			a = (ExerciseTable) ois.readObject();
			b = (ExerciseTable) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(a.toString());
		System.out.println(b.toString());

	}

}
