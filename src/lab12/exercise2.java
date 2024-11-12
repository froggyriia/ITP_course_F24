package lab12;

import java.io.*;

public class exercise2 {
    public static void main(String[] args) {
        // Using try-with-resources to handle automatic resource closing
        try (FileInputStream in = new FileInputStream("/Users/vika/IdeaProjects/lab11/src/lab12/input.txt");
             FileOutputStream out = new FileOutputStream("/Users/vika/IdeaProjects/lab11/src/lab12/output.txt")) {

            // Create File objects for input and output files
            File input = new File("/Users/vika/IdeaProjects/lab11/src/lab12/output.txt");
            File output = new File("/Users/vika/IdeaProjects/lab11/src/lab12/output.txt");

            // Check if the input file exists, throw FileNotFoundException if it does not
            if (!input.exists()) {
                throw new FileNotFoundException("Input file does not exist.");
            }

            // Check if the output file is writable
            // If the file exists but is not writable, throw SecurityException
            if (output.exists() && !output.canWrite()) {
                throw new SecurityException("No write permission for the output file.");
            }

            // Read the entire content of the input file into a byte array
            byte[] buffer = new byte[in.available()];

            // Reading data from the input file into the buffer
            int bytesRead = in.read(buffer, 0, buffer.length);

            // Writing data from the buffer to the output file
            out.write(buffer, 0, bytesRead);

            System.out.println("File copy completed successfully.");

        } catch (FileNotFoundException ex) {
            // Handle case where input file does not exist
            System.out.println("Error: " + ex.getMessage());

        } catch (SecurityException ex) {
            // Handle case where there is no write permission for the output file
            System.out.println("Error: " + ex.getMessage());

        } catch (IOException ex) {
            // Handle other I/O exceptions
            System.out.println("An I/O error occurred: " + ex.getMessage());
        }
    }
}
