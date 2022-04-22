package ButteredReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferedReadExample {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("temp/test/nagasaki.txt");
		BufferedReader in = Files.newBufferedReader(path);
		
		String line;
		while((line=in.readLine())!=null){
			
			System.out.println(line);
		}

	}

}
