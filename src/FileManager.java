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

    public FileManager(String inputPathFile)
    {
        this.inputPathFile = inputPathFile;
        this.outputPathFile = getDownloadPath() + "output-batch-processing.txt";
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

    private String getDownloadPath() {
        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("win"))
            return System.getProperty("user.home") + "\\Downloads\\";

        else if(os.contains("nix") || os.contains("nux") || os.contains("mac"))
            return System.getProperty("user.home") + "/Downloads/";

        return null;
    }

}


