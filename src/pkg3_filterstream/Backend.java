package pkg3_filterstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Backend {
    
    public void inputStream(String dir){
        try {
            FileInputStream fileInput = new FileInputStream(dir);
            int data = fileInput.read();
            while (data != -1)
            {
                data = fileInput.read();
            }
            fileInput.close(); 
        } catch (IOException ioe) {
            System.err.println("I/O error - " + ioe);
        }
    }
    
    public void outputStream(String source, String destination) {
        try {
            FileInputStream input = new FileInputStream(source);
            System.out.println("Opened " + source + "for reading. { }");
            OutputStream output = new FileOutputStream(destination);
            System.out.println("Opened " + destination + " for writing.");
            int data = input.read();
            while (data != -1) {
                output.write(data);
                data = input.read();
            }
            input.close();
            output.close();
            System.out.println("I/O streams closed");
        } catch (IOException ioe) {
            System.err.println("I/O error - " + ioe);
        }
    }
}
