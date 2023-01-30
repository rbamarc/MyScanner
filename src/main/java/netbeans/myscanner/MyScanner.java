package netbeans.myscanner;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class MyScanner {

    public static void main(String[] args) {
        //declare the number variable and initialize to 0
        String name = "";
        int age = 0;
        //int computers = 0;
        //String hometown = "";
        
        //declare and initialize a scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //ask user to input their name
        System.out.println("Please enter your name: ");
        //now wait for the user to type something in - assign it to name
        name = myScanner.nextLine();
        
        //ask user to input their age
        System.out.println("Please enter your age: ");
        //now wait for user to enter their name
        age = myScanner.nextInt();
        
        //we will get the other values in the next commit
        
        System.out.println("Hi " + name + " your age is: " + age);
    }
}
