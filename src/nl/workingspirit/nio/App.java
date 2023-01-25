package nl.workingspirit.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;

public class App {

    public static final String INPUTFILE = "readme.txt";
    public static final String OUTPUTFILE = "newfilecreated.txt";

    public static void main(String[] args) throws IOException {

        // create a path to inputfile
        final Path pathToInputFile = Paths.get(INPUTFILE);

        // write the lines from that file to console
        Files.lines(pathToInputFile).forEach(line -> {
            System.out.println(line);
        });

        // create outputfile
        Path pathToOutputFile = Paths.get(OUTPUTFILE);
        {
            // use this block to be sure not to reuse the File class since we ar working on NIO
            File file = pathToOutputFile.toFile();
            if (file.exists()) {
                file.delete();
            }
        }
        // Create the file whether or not it is deleted
        Files.createFile(pathToOutputFile);

        // print the content of the inputfile to the outputfile
        Files.lines(pathToInputFile).forEach(line -> {
            try {
                Files.write(pathToOutputFile, String.format("%s%n", line).getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.err.println("Error during writing to outputfile");
            }
        });

        // create dir
        String dir = "test1/test2/test3";
        Path pathToDir = Paths.get(dir);
        Files.createDirectories(pathToDir);
        System.out.println("Directory should be created now!");
    }
}
