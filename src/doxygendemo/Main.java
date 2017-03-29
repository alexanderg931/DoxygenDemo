package doxygendemo;
import java.util.Scanner;

/**
 * \mainpage Doxygen Test
 * \section first_section Welcome
 * 
 * Welcome to the documentation page for the Doxygen Test
 * 
 * \section classes Classes
 * 
 * \ref Main\n
 * \ref TestClass
 */

/**
 * \class Main
 * \package doxygendemo
 * \author Grant
 * \version 1.0
 * \brief The main class
 */
public class Main {

    /**
     * \static \fn main
     * \brief Seeks user input of an integer, string, and character. Makes TestClass object with these values as parameters. Asks for another integer. Compares it to integer attribute of TestClass Object.
     */
    public static void main(String[] args) {
        System.out.printf("Welcome to the test of Doxygen for GAWK's Senior Project.");
        Scanner input = new Scanner(System.in);
        System.out.printf("\nEnter an integer: ");
        int testInteger = input.nextInt();
        System.out.printf("\nEnter a String: ");
        String testString = input.next();
        System.out.printf("\nEnter a character: ");
        char testChar = input.next().toCharArray()[0];
        System.out.printf("\nMaking test object...");
        TestClass test = new TestClass(testInteger, testString, testChar);
        System.out.printf("\nEnter another integer: ");
        int secondInteger = input.nextInt();
        System.out.printf("\nSeeing if integers are equal...");
        System.out.printf("\n\tAre the integers equal? " + test.testMethod(test.getInt(), secondInteger) + ".");
        System.out.printf("\nThis concludes the test of Doxygen.");
    }
    
}
