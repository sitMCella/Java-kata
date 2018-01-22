package it.mcella.kata;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    
    private final DigitsReader digitsReader;
    private final DigitsParser digitsParser;

    public Main(DigitsReader digitsReader, DigitsParser digitsParser) {
        this.digitsReader = digitsReader;
        this.digitsParser = digitsParser;
    }

    public static void main(String[] args) {
        try {
            if(args.length != 1) {
                System.out.println("Usage:");
                System.out.println("java -cp target\\classes;lib\\* it.mcella.kata.Main path");
                System.out.println("where path is the digits file path");
                System.exit(1);
            }
            String filePath = args[0];
            URI file = new URI(filePath);

            DigitsReader digitsReader = new DigitsReader();
            DigitsParser digitsParser = new DigitsParser();
            Main main = new Main(digitsReader, digitsParser);
            
            int parsed = main.parse(file);
            System.out.println("Parsed digits: " + parsed);
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public int parse(URI uri) throws Exception {
        try (Stream<String> stream = Files.lines(Paths.get(uri))) {
            List<String> rows = new ArrayList<>();
			stream.forEach(rows::add);
            List<String> digits = digitsReader.readDigitsFrom(rows);
            return digitsParser.parse(digits);

		} catch (Exception e) {
            throw new Exception(e.getMessage(), e);
		}
    }

}


