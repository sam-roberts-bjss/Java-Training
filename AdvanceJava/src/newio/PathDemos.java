package newio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemos {
    public static void main(String[] args) {
        Path dictionary = Paths.get("/", "usr", "share", "dict", "web2");
        System.out.println(dictionary);

        Path home = Paths.get("/Users/sam.roberts");
        System.out.println(home);

        Path docs = home.resolve("Documents");
        System.out.println(docs);

        System.out.println();
        System.out.println("Project directory: ");
        Path project = Paths.get(".");
        System.out.println(project);
        System.out.println(project.toAbsolutePath());
        System.out.println("As a URL: " + project.toUri());

        Path p = Paths.get("/Users/Documents/./IntelliJ/..").normalize();
        System.out.println("Normalized " + p);


    }
}
