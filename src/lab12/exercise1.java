package lab12;

import java.io.*;

public class exercise1 {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt"))
        {

            File input = new File("input.txt");
            File output = new File("output.txt");
            if (!input.exists()) {
                throw new FileNotFoundException("File not found");
            }
            if (!output.createNewFile()) {
                throw new SecurityException("Cannot write in the file");
            }
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch(FileNotFoundException ex){

            System.out.println(ex.getMessage());

        } catch(SecurityException ex){

            System.out.println(ex.getMessage());

        } catch(IOException ex){

            System.out.println(ex.getMessage());

        }
    }
}
