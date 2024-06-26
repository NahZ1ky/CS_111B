import java.util.Scanner;
import java.util.InputMismatchException;

public class zybook_1107 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputName;
        int age;

        inputName = scnr.next();
        while (!inputName.equals("-1")) {
            // The following line will throw an InputMismatchException
            //        Insert a try/catch statement to catch the exception.
            try {
                age = scnr.nextInt();
            } catch (InputMismatchException ex) {
                age = -1;
                scnr.nextLine();
            }
            System.out.println(inputName + " " + (age + 1));

            inputName = scnr.next();
        }
        scnr.close();
    }
}