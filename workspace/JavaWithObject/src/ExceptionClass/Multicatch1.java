package ExceptionClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Multicatch1 {
	public static void main(String[] args) {

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("test.txt"));
			String str = (String) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
