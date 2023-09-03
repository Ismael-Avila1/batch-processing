import java.util.ArrayList;
public class Main {

    public static void main(String[] args)
    {
        ArrayList<String> fileContent = FileManager.readFile("./test-files/prueba2.txt");

        ArrayList<String> processedData = DataProcessing.processData(fileContent);

        if(FileManager.writeFile(processedData) == 1)
            System.out.println("Data processed successfully");
        else
            System.out.println("Error processing data");
    }
}
