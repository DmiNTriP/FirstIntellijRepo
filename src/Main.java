import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException {
        TestCase testCase = new TestCase();
        BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
        int numIn;
        int input = 0;

        HashTable table = new HashTable();
        Employee emp = null;
        Employee employee = new Employee("Kyler", "Callaway", "kyler.callaway@gmail.com", "555-555-5555");
        String choice;
        // write your code here
        //TODO just removing the main method and adding it to the TestCase Class
        String desicison = null;
        int output;
        System.out.println("Please enter 1 for HashTable or 2 for tree structure ");
        desicison = mReader.readLine();
        output = Integer.parseInt(desicison);

        while(output!= 0){
        if (output == 1) {
            testCase.addEmployee();
/*
            table.addInformation(testCase.emp);
*/
            System.out.println("The employee has been added");
        }
            System.out.println("to add another employee type 1 to search an employee type 2 to remove an employee type 3 to quit type q");

            choice = mReader.readLine();
            output = Integer.parseInt(choice);
            if (output == 1) {
                testCase.addEmployee();
            } else if (output == 2) {
                testCase.searchEmployee();
            }
                else if(output == 3){
                output = Integer  .parseInt(choice);
                System.out.println("this is where you would enter the employee you would like to delete");
                }
            else if (output == 0) {
                output = Integer.parseInt(choice);
                System.out.println("have a great day ");
                System.exit(0);
            }
             else{
                System.out.println("you did not enter a correct value please try again");
                }
                   System.out.println("Kyler you need to put something in for the trees");
            }
                System.out.println("done with program");


        }
    }






/*
                        table.displayTheEmployees();
*//*
*/
/*

                        System.out.println(emp);
                        System.out.println(table);

                        System.out.println("  Please input either 1 or 2  to add another employee or done to exit the program");
                        choice = mReader.readLine();
                        if(choice.equals("1")) {
                           choice ="add";
                        }
                        else if (choice.equals("2")) {
                            System.out.println("Please enter the name of the person you would like to searcxh for ");
                         String fn = emp.fullName(); fn = mReader.readLine();
                            table.find(fn);


                        }
                         else {
                            choice.equals("3");
                        }
                        break;


                    case "done":
                        System.out.println("Thanks for entering the employees information");
                        break;
                    default:
                        System.out.println("you got to enter something here ");
                        System.out.println("Please enter add or done into the system to exit program");
                        choice = mReader.readLine();
                        break;

                }

        } while (!choice.equals("done"));
*//*


    }
*/



