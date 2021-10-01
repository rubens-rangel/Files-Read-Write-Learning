package Application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ruben\\OneDrive\\Área de Trabalho\\in.csv");

        try {
            Scanner sc = new Scanner(file);

        }
        catch (IOException e){
            System.out.println("File not Found or can't be read");
        }
        finally {

        }

    }
}
