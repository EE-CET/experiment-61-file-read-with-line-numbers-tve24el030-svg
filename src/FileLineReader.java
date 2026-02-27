public class FileLineReader {
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        // TODO: Use a try-with-resources block to open a BufferedReader for the file
        // TODO: Read the file line by line using a loop
        // TODO: Keep track of the line number (starting from 1)
        // TODO: Print each line in the format "lineNumber: lineContent"
        // TODO: Catch and handle any IOExceptions that might occur
        
        

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}