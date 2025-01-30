import java.util.Scanner;

public class InputWanted {

    public static  void main (String[] args) {
        Scanner inputTaker = new Scanner(System.in);
        String name = "";

        System.out.println("Please enter your name:");
        name = inputTaker.nextLine();

        System.out.println("Hello " + name + "!");
    }
}
