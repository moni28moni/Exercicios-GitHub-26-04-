package Bufferedreader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreader {
    public static void main(String[] args) {
        String arquivo = "arquivo.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
            System.out.println(linha);
            }
        }
        catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }
}
