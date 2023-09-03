import java.util.ArrayList;
public class Main {

    public static void main(String[] args)
    {
        FileManager fileManager = new FileManager("./test-files/prueba2.txt");
        ArrayList<String> fileContent = fileManager.readFile();

        DataProcessing dataProcessing = new DataProcessing();
        ArrayList<String> processedData = dataProcessing.processData(fileContent);

        fileManager.writeFile(processedData);
        if(fileManager.writeFile(processedData) == 1)
            System.out.println("Data processed successfully");
        else
            System.out.println("Error processing data");
    }
}
