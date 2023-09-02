import java.util.ArrayList;
public class Main {

    public static void main(String[] args)
    {
        FileManager fileManager = new FileManager("./test-files/prueba2.txt");
        ArrayList<String> fileContent = fileManager.readFile();

        fileManager.writeFile(new ArrayList<>(fileContent.subList(10, 20)));
    }
}
