package workWithFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\perel\\IdeaProjects\\stepik\\A");
        Files.walkFileTree(path, new MyFileVisitor());
    }
}
