
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;


public class Address
{
    @SuppressWarnings("resource")
    public static void print() throws Exception
    {
        try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\kmoha\\IdeaProjects\\AddressBookCSV-and-Json\\data.csv")))
        {
            //Read CSV line by line and use the string array as you want
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    //Verifying the read data here
                    System.out.println(Arrays.toString(nextLine));
                }
            }
        }
    }
}