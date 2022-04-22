package ButteredReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class OStreamExample {

	public static void main(String[] args) {
		String path = "temp/test/osteam.dat";

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));) {

			out.writeInt(12345);
			out.writeUTF("•¶Žš—ñ");
			out.writeObject(LocalDate.now());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));) {
			
			int number = in.readInt();
			String str = in.readUTF();
			LocalDate date = (LocalDate)in.readObject();
			
			System.out.println(number + "\t" + str + "\t" + date);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
