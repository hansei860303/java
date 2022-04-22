package FileAndPath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample1 {

	public static void main(String[] args) {
		Path p = Paths.get("C:/00_mywork/JavaFile/test.txt");
		System.out.println(p);
		System.out.println(p.getParent());
		System.out.println(p.getFileName());
	}

}
