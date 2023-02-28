import model.User;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        play();
    }

    static void play(){
        String homePage = "----- Welcome To Java Hotels and Suit ----- \n" +
                "1) Register\n" +
                "2) Login As Admin\n" +
                "3) Login As User\n" +
                "4) view Services\n" +
                "\n---- Enter 1 - 4 -----";

        System.out.println(homePage);
        String choice = scanner.nextLine();
        if(choice.equals("1")) register();
    }

    static void register(){
        System.out.println("Enter FirstName");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName");
        String lastName = scanner.nextLine();
        System.out.println("Enter Email");
        String email = scanner.nextLine();
        System.out.println("Enter Password");
        String password = scanner.nextLine();

        System.out.println("full name = "+firstName+" "+lastName);
        System.out.println("Email = "+email);

        User user = new User(firstName, lastName, password, email);




    }
}


