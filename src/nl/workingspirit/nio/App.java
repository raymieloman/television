package nl.workingspirit.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;

public class App {

    public static void main(String[] args) throws IOException {

        final Path pathToInputFile = Paths.get("readme.txt");

        Files.lines(pathToInputFile).forEach(line -> {
            System.out.println(line);
        }); 


        Path pathToOutputFile = Paths.get("newfilecreated.txt");
        File file = pathToOutputFile.toFile();
        if (file.exists()) {
            file.delete();
        }
        Files.createFile(pathToOutputFile);


        Files.lines(pathToInputFile).forEach(line -> {
            try {
                Files.write(pathToOutputFile, String.format("%s%n",line).getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.err.println("Die file bestaat niet");
            }
        });

        // create dir
        String dir = "test1/test2/test3";
        Path pathToDir = Paths.get(dir);
        Files.createDirectories(pathToDir);
        System.out.println("Directory should be created now!");
    }
}
