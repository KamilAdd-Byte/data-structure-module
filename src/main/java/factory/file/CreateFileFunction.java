package factory.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@FunctionalInterface
public interface CreateFileFunction {

    File createNewFile (String name) throws IOException;

    static Path createDirectory(String path) throws IOException {
        return Files.createDirectory(Paths.get(path));
    }

    static File create (String fileName) throws IOException {
        File file = new File(fileName);
        boolean newFile = file.createNewFile();
        if (newFile) {
            System.out.println("Create file status: Operation successful");
            return file;
        } else {
            throw new IOException("Operation down");
        }

    }

    static Path moveFile (Path basic, Path toMove) throws IOException {
        return Files.move(Paths.get(basic.toUri()), Paths.get(toMove.toUri()), StandardCopyOption.REPLACE_EXISTING);
    }
}
