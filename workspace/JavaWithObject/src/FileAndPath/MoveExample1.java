package FileAndPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveExample1 {
	public static void main(String[] args) throws IOException {
		Path source = Paths.get("test.txt");
		Path target = Paths.get("temp/test/sourseFile.txt");
		Files.move(source, target,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.ATOMIC_MOVE);
	}
}

