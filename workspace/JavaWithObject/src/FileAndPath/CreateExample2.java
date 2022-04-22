package FileAndPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateExample2 {

	public static void main(String[] args) {
		Path path = Paths.get("temp/test");
		try {
			Files.createDirectory(path);
		} catch (IOException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}
	}

}
