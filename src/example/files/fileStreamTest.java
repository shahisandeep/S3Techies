package example.files;

import java.io.*;
public class fileStreamTest {

    public static void main(String args[]) {

        try {
            byte bWrite [] = "sandeep".getBytes();

            //FileOutputStream is used to create a file and write data into it
            //The stream would create a file, if it doesn't already exist, before
            //opening it for output
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0; x < bWrite.length ; x++) {
                os.write( bWrite[x] );   // writes the bytes
            }
            os.close();

            //This stream is used for reading data from the files. Objects can be
            //created using the keyword new and there are several types of
            //constructors available. Constructor takes a file name as a string to
            //create an input stream object to read the file
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}