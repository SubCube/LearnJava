/* Challenge Activity 1

Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge

Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

*/
package helloyourname2ways;

import java.util.Scanner;

/**
 *
 * @author mafudge - of the task
 * @author Maksim Belfer
 *
 * Solved 14.11.2023
 */
public class HelloYourName2Ways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();

        System.out.println("Hello, " + firstName + " " + lastName + "!");
        System.out.println("Or should I say: " + lastName + ", " + firstName + "!");

    }
    
}
