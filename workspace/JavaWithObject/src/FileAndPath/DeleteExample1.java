package FileAndPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteExample1 {

	public static void main(String[] args) throws IOException {
		Path target = Paths.get("temp/test/note.txt");
		if(Files.exists(target)) {
			Files.delete(target);
		}
	}
}
