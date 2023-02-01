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
        int computers = 0;
        String hometown = "";
        
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
        
        //ask user to enter the number of computers
        //they have
        System.out.println("Please enter the number of computers you own: ");
        //now wait until the user types the number of computers
        computers = myScanner.nextInt();
        
        //ask user to input their hometown
        System.out.println("Please enter your hometown: ");
        //now wait for hometown to be input
        hometown = myScanner.nextLine();
        
        //now print the information to the console
        
        System.out.println("Hi " + name + " from " + hometown);
        System.out.println("Your age is: " + age);
        System.out.println("Number of computers you own: " + computers);
    }
}
