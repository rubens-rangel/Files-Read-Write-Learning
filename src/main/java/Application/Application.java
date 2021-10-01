
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class application {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\rubens.rangel\\Desktop\\java-learning\\in.csv");
        Scanner sc = null;
        int i=0;
        String[] object = null;
        
        new File("C:\\Users\\rubens.rangel\\Desktop\\java-learning\\subdir").mkdir();              
        
        
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\rubens.rangel\\Desktop\\java-learning\\subdir\\summary.csv"))){
        	sc = new Scanner(file);   
        	
        	      	       	
        	while (sc.hasNextLine()) {       		
        	object = sc.nextLine().split(";");           	
        	bw.write(object[0] + ";"+ object[1]);
        	bw.newLine();
        	System.out.println("Pasta criada com sucesso!");
        	}
        	
        }
        catch (IOException e){
            System.out.println("File not found or can't be read");
        }
        finally {
        	
        	if (sc != null) {
        	sc.close();
        	}
        }
    }
}
