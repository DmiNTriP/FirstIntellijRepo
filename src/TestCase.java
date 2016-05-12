import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;




public class TestCase {
    BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
    HashTable table = new HashTable();
    Employee emp = new Employee("Kyler", "Callaway", "kyler.callaway", "k");
    MyLinkedList theLinkedList = new MyLinkedList(emp);

    public void addEmployee() throws FileNotFoundException, IOException {

        String choice;
        // creating the user interface
        System.out.println("type add to add a new Employee to the phone book");
        choice = aReader.readLine();

    /* if (!choice.equals("add") || !choice.equals("done")) {*/

        switch (choice) {
            case "add":

                System.out.println("Please Enter Employees first Name");
                emp.setFirstName(aReader.readLine());
                System.out.println("Please Enter Employees Last Name");
                emp.setLastName(aReader.readLine());
                String fullName = emp.fullName();
                System.out.println("Please Enter employees email address");
                emp.setEmail(aReader.readLine());
                System.out.println("Please Enter employees phone number");
                emp.setPhoneNum(aReader.readLine());
                System.out.printf("%s %n The hashcode is: %s %n %s %n %s%n", emp.fullName(), emp.fullName().hashCode(), emp.getEmail(), emp.getPhoneNum());

                //TODO: add the table information to its own metthod this is just the kiosk
                  table.addInformation(emp);


        }




                   /* }while (choice.equals("add")) ;*/
/*
                        table.displayTheEmployees();
*/
    }
    public void  searchEmployee()throws IOException{
        System.out.println("To search for an employee");
        System.out.println("Please Enter Employees first Name");
        emp.setFirstName(aReader.readLine());
        System.out.println("Please Enter Employees Last Name");
        emp.setLastName(aReader.readLine());
        table.find(emp.fullName());

    }
}




/*
//                    System.out.println(emp);
                    System.out.println(table);
                    System.out.println("to add another employee please enter add or ");
*/



