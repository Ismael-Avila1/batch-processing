import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    private String inputPathFile;
    private String outputPathFile;

    FileManager() {}

    public FileManager(String inputPathFile, String outputPathFile)
    {
        this.inputPathFile = inputPathFile;
        this.outputPathFile = outputPathFile;
    }

    public ArrayList<String> readFile()
    {
        ArrayList<String> fileContent = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputPathFile));
            String line = reader.readLine();

            while (line != null) {
                fileContent.add(line + "\n");
                line = reader.readLine();
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileContent;
    }

}


