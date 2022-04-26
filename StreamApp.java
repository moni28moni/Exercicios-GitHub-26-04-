package StreamApp;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamApp {
    private static Iterable<Path> fluxo;

    public static void main(String [] args) throws IOException {

        String arquivo = "arquivo.txt";
        try (Stream<String> fluxo = Files.lines(Paths.get(arquivo))){
            fluxo.forEach (System.out :: println);  
                 
        } catch (IOException e) {
           System.out.println("Ocorreu um erro");
           e.printStackTrace();
        }
    }

}