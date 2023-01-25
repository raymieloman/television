package nl.workingspirit.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class App {

    public static void main(String[] args) throws IOException {

        final Path pathToInputFile = Paths.get("readme.txt");

        Files.lines(pathToInputFile).forEach(line -> {
            System.out.println(line);
        }); 


        Path p2 = Paths.get("newfilecreated.txt");
        p2.toFile().createNewFile();

        final Path pathToOutputFile = Paths.get("newfilecreated.txt");

        Files.lines(pathToInputFile).forEach(line -> {
            try {
                Files.write(pathToOutputFile, String.format("%s%n",line).getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.err.println("Die file bestaat niet");
            }
        });
    }

    // Assignment: The file 'newfilecreated.txt' should be cleaned every time
}
