

import java.security.PublicKey;
import java.util.HashMap;

/**
 * Created by Kyler on 4/20/2016.
 */
public class HashTable {

    MyLinkedList[] linkListArray; // this will be a linked list array
    MyLinkedList link;

    int arraySize = 13;
    Employee newEmployee;

    public HashTable() {// the size here will determine how big we want the array to be and in this case it will be 13
        //creating the Array for the linkedlist

        linkListArray = new MyLinkedList[arraySize];
        link = new MyLinkedList(newEmployee);
/*
     addInformation(newEmployee);
*/
    }

    private int nameHashingFunction(String fullNameHash) {
        int hKeyValue = link.getFirstEmployee().key;

        //K has a unicde character value of 75. 75 -1 will start the letter count at 1

        for (int i = 0; i < fullNameHash.length(); i++) {
            int charCodeK = fullNameHash.charAt(i) - 74;
            //This is the formula for the hashcode method in Employee
            int hashFormula = fullNameHash.hashCode();
            int temphashKeyValue = hKeyValue;

            //calculate hash key using the 26 letters in alphabet + a blank
            hKeyValue = (hKeyValue * 27 + hashFormula) % arraySize;

            System.out.println("The Hash Key Value is: " + temphashKeyValue +
                    " * 27 + Character code (unicode) " + "%" +
                    " arraySize " + arraySize + " = " + hKeyValue);
        }
        return hKeyValue;

    }

/*    public void insertEmployee(Employee newEmployee) {
        String fullNameToHash = newEmployee.fullName();
        *//*Create hashKey - done
        / Once we have hash key, we use % to find the bucket.
        *//*
        
        int hashKey = newEmployee.nameToHash();
        
        int hashBucket = hashKey % 13;
        
        *//* Now, we want to take the hashBuket and insert into that linked list.*//*
        //  int hashKey = nameHashingFunction(fullNameToHash);
      *//* for (int i = 0; i < arraySize; i++) {
            linkListArray[i].insert(newEmployee);
        }
       *//*
        linkListArray[hashBucket].insert(newEmployee);
    }*/

    public Employee find (String nameToFind) {
        int hashKey = nameHashingFunction(nameToFind);
        Employee found = linkListArray[hashKey].Search(hashKey, nameToFind);
        return found;
    }

    public void addInformation(Employee anEmployee) {
        int hashKey = anEmployee.nameToHash();
        anEmployee.key = hashKey;
        Employee current = null;
        current = anEmployee;

        if (anEmployee == current && current.key == hashKey) {
            String firstName = anEmployee.getFirstName();
            String lastName = anEmployee.getLastName();
            String eMail = anEmployee.getEmail();
            String phoneNum = anEmployee.getPhoneNum();
            anEmployee = new Employee(firstName, lastName, eMail, phoneNum);
            link.insert(anEmployee);
            int hashBucket = hashKey % 13;
            linkListArray[hashBucket] = link;
//            insertEmployee(anEmployee);
        }


    }
/*    public void displayTheEmployees() {
//get hashBucket
// the bucket is empty/null then the employee cannot be listed.
    	
    while (linkListArray[arraySize] != null){


            System.out.println("theArray Index " + linkListArray);


        }
    }*/
}