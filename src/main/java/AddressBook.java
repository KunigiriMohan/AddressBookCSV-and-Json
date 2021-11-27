import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class AddressBookMain {

    /*
     * menu() method for showing options user has
     * */
    public static void menu()
    {
        System.out.println("Press 1 for Adding a new contact to your address book.");
        System.out.println("Press 2 for Showing Contacts");
        System.out.println("Press 3 to Quit.");
    }

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        AddressBookMain obj = new AddressBookMain();
        String csv = "data.csv";
        menu();
        int choice = inp.nextInt();
        while (choice != 3) {

            if (choice == 1) {
                CSVWriter writer = new CSVWriter(new FileWriter(csv,true));
                System.out.println("Enter First Name:");
                String fName = inp.next();
                System.out.println("Enter Last NAme");
                String lName = inp.next();
                System.out.println("Enter  phone number.");
                String number = inp.next();
                System.out.println("Enter The City");
                String city = inp.next();
                System.out.println("Enter The State");
                String state = inp.next();
                System.out.println("Enter the pin code");
                String pinCode = inp.next();

                //Create record
                String [] record = {fName, lName, number, city, state, pinCode};
                //Write the record to file
                writer.writeNext(record);

                //close the writer
                writer.close();

            }
            else if (choice == 2) {
                ParseCSVLineByLine obj1= new ParseCSVLineByLine();
                obj1.print();
            }
            menu();
            choice = inp.nextInt();
        }
    }
}