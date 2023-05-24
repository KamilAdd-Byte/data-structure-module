package factory;

import factory.file.CreateFileFunction;

import java.io.*;
import java.util.Scanner;

public class ExampleScanner {
    /*
    Przypomnienie działania Write / Reader
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Nazwij plik: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File file = CreateFileFunction.create(fileName);
        file.createNewFile();
        System.out.println("dodano " + fileName);

        FileWriter writer = new FileWriter(file);

        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        System.out.println("wpisz słowo do pliku: ");
        String word = scanner.nextLine();

        bufferedWriter.write(word);
        bufferedWriter.close();

        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String readLine = bufferedReader.readLine();
        System.out.println("Przeczytana linia: " + readLine);

    }
}
