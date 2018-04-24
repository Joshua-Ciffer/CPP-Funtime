
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 *
 * @author Joshua Ciffer
 * @version 04/24/2018
 */
public class SerializableTest implements Serializable {

	private static class Human implements Serializable {
		
		private static final long serialVersionUID = 1L;
		private final String NAME;
		private int age;
		
		Human(String name, int age) {
			this.NAME = name;
			this.age = age;
		}
		
		public String toString() {
			return "Name: " + NAME + ", Age: " + age;
		}
		
	}
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String filePath = "C:\\Users\\Joshua\\Desktop\\Object.ser";
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
		out.writeObject(new String("Hello World!"));
		out.writeObject(new SerializableTest());
		out.writeObject(new Human("Joshua", 16));
		out.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		in.close();
	}
	
}