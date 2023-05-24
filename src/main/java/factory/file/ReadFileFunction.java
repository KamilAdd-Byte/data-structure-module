package factory.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface ReadFileFunction {

    String write(String toWrite);

    /**
     * @param fileToRead src or string'src to read
     * @return long for words length bigger than 8 char
     */
    static String read(String fileToRead) {
        // FIXME: 08/03/2023 Modification this method!
        try {
            String words = Files.readString(
                    Paths.get(fileToRead));
            List<String> list = Arrays.asList(words.split("\\PL+"));
            long nElem = list.stream()
                    .filter(s -> s.length() > 8)
                    .count();
            System.out.println(nElem);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileToRead;
    }
}
