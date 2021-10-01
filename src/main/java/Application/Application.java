
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\rubens.rangel\\Desktop\\java-learning\\in.txt");
        Scanner sc = null;
        int i=0;
        String[] object = null;
        
        try {
        	sc = new Scanner(file);   
        	
        	
        	
        	
        	while (sc.hasNextLine()) {       		

        	object = sc.nextLine().split(",");        			
        	System.out.println(Arrays.toString(object));
        	System.out.println("objeto1:" + object[0]);
        	System.out.println("objeto1:" + object[1]);
        	System.out.println("objeto2:" + object[2]);
        	i++;
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
