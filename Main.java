// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            System.out.println("hi there ");
            int a=3;
            float b=4.4f;
            String str="hello world";
            System.out.println("printing the numbers "+a+" "+b+" "+str);
            Scanner scanner=new Scanner(System.in);
            System.out.println("please enter ur name");
            String name=scanner.nextLine();
            System.out.println("enter ur age");
            int age=scanner.nextInt();
            scanner.nextLine();
            if(name.charAt(0)=='S'){
                if(age>18)
                    System.out.println(("you are good to go"));
                else
                    System.out.println("you don't qualify age limit");
            }
            else
                System.out.println("Cannot proceed please enter your name correctly");

    }
}