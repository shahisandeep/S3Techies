package example.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//byte stream used to perform input and output of 8 bit bytes
public class copyFile {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            //attach the file to FileInputStream
            inputStream = new FileInputStream("input.txt");
            outputStream = new FileOutputStream("output.txt");

            int ch;

            //read characters from FileInputStream and write them
            while ((ch = inputStream.read()) != -1) {
                outputStream.write(ch);
            }
        }

        finally {
            if(inputStream != null) {
                inputStream.close();
            }
            if(outputStream !=null) {
                outputStream.close();
            }
        }

    }
}
