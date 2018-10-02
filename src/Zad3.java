import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Zad3 {

    public static void main(String[] args){
        String path = "C:\\Users\\s0163842\\IdeaProjects\\PP_lab\\src\\macbeth.txt";

        try {
            Stream<String> stream = Files.lines(Paths.get(path));
            long wordsCounter = stream.flatMap(s -> Arrays.stream(s.split("\\W+")))
                                .map(String::toLowerCase)
                                .distinct()
                                .count();
            System.out.println(wordsCounter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
