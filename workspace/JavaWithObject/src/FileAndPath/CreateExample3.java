package FileAndPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateExample3 {

	public static void main(String[] args) {
		Path path = Paths.get("temp/test/note.txt");
		try {
			Files.createFile(path);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
