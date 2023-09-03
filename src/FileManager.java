import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    FileManager() {}

    public static ArrayList<String> readFile(String inputPathFile)
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

    public static int writeFile(ArrayList<String> content)
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(getDownloadPath() + "output-batch-processing.txt"));

            for (String line : content)
                writer.write(line + "\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }

        return 1;
    }

    private static String getDownloadPath() {
        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("win"))
            return System.getProperty("user.home") + "\\Downloads\\";

        else if(os.contains("nix") || os.contains("nux") || os.contains("mac"))
            return System.getProperty("user.home") + "/Downloads/";

        return null;
    }

}