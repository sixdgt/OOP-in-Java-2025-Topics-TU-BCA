package iostream;

import java.io.*;

public class FileOutputStreamExample {
    public static void main(String args[]) throws IOException {
        String input_path = "C:/Users/flaw-/Documents/NetBeansProjects/Java OOP 2025 Topics/LabTwelveInputOutputStream/src/iostream/Subject.txt";
        String output_path = "C:/Users/flaw-/Documents/NetBeansProjects/Java OOP 2025 Topics/LabTwelveInputOutputStream/src/iostream/CopySubject.txt";
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            File file_input = new File(input_path); // Subject.txt
            File file_output = new File(output_path); // CopySubject.txt
            // Reading file content
            input = new FileInputStream(file_input);
            // Writing file content
            output = new FileOutputStream(file_output);
            int c;
            while((c = input.read()) != -1){ // reading file content
                output.write((char) c); // writing content to new file
            }
        } finally {
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }
        }
    }
}
