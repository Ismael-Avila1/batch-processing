import java.util.ArrayList;

public class DataProcessing {

    public DataProcessing() {}

    public static ArrayList<String> processData(ArrayList<String> inputData)
    {
        ArrayList<String> outputData = new ArrayList<>();

        for(String line : inputData) {
            String[] lineArray = line.split(",");

            outputData.add(lineArray[2] + " : " + ipV6toDec(lineArray[0].substring(0, lineArray[0].indexOf("/"))) + ipV4toHex(lineArray[5].substring(0, lineArray[5].indexOf("\n"))));
        }

        return outputData;
    }

    private static String ipV6toDec(String ipV6)
    {
        StringBuilder s = new StringBuilder();
        String[] ipV6Array = ipV6.split(":");

        for(String ipV6Part : ipV6Array)
            s.append(Integer.parseInt(ipV6Part, 16)).append(" : ");

        return s.toString();
    }

    private static String ipV4toHex(String ipV4)
    {
        StringBuilder s = new StringBuilder();
        String[] ipV4Array = ipV4.split("\\.");

        for(String ipV4Part : ipV4Array)
            s.append(Integer.toHexString(Integer.parseInt(ipV4Part))).append(".");

        return s.toString().toUpperCase();
    }

}
