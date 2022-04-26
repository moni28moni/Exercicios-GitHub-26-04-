package ScannerExercicio;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
    
    public class ScannerExercicio {

        public static void main(String [] args) throws IOException {
            String fileName = "arquivo.txt";
            Scanner scan = new Scanner(new File(fileName));
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
        }
    }
}    