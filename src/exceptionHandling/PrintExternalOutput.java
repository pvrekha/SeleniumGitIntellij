package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintExternalOutput {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\RekhaVanchinathan\\Output.txt");
        PrintWriter print = new PrintWriter(file);
        print.println("My name is Rekha");
        print.close();


    }
}
