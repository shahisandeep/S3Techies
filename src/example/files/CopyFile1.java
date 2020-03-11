package example.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

//java character streams are used to perform input and output for 16-bit unicode
public class CopyFile1 {

    public static void main(String[] args) throws IOException, FileNotFoundException, FileAlreadyExistsException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("input.txt");
            fileWriter = new FileWriter("output.txt");

            int ch;
            while ((ch = fileReader.read()) != -1) {
                fileWriter.write(ch);
            }
        }

        finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
