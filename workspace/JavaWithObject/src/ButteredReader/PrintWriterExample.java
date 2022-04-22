package ButteredReader;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		
		try(PrintWriter out = new PrintWriter("temp/test/data.txt");){
			
			out.print(100);
			out.print("\t");
			out.print("ƒeƒXƒg");
			out.print("\t");
			out.print(60.5);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
