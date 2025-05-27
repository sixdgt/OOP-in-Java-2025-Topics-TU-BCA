package iostream;

import java.io.*;

public class IOStreamExample {
    public static void main(String args[]) throws IOException{
        String path = "C:/Users/flaw-/Documents/NetBeansProjects/Java OOP 2025 Topics/LabTwelveInputOutputStream/src/iostream/Subject.txt";
        File subject = null;
        FileInputStream fi = null;
        try {
            subject = new File(path);
            int c;
            fi = new FileInputStream(subject);
            while((c = fi.read()) != -1){
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(fi != null){
                fi.close();
            }
        }
    }
}
