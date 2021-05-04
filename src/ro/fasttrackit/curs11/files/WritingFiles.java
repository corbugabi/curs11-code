package ro.fasttrackit.curs11.files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingFiles {
    public static void main(String[] args) throws Exception{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"))) {
            writer.write("This is from JAVA!");

        }

    }
}
