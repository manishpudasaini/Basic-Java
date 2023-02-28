package TypeGenerics.Task;

import java.util.Scanner;

public class MainPage {
    public static void main(String[] args) {
        RegistrationPage rp = new RegistrationPage();
        Scanner sc = new Scanner(System.in);

        char loopEntry='y';
        while (loopEntry == 'y'){
            System.out.println("Enter 1.Registration");
            System.out.println("Enter 2.Login");
            System.out.println("Enter 3.Exit");

            int choice =sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter your username::");
                    String username =sc.nextLine();
                    System.out.println("Enter you password:");
                    String password = sc.nextLine();

                    System.out.println("Main "+username);

                    RegistrationPage rg = new RegistrationPage(username,password);
                    System.out.println("rg username "+rg.getUsername());

                    break;

                case 2:
                    System.out.println("Enter your username:");
                    String yourUsername = sc.nextLine();
                    System.out.println("Enter your password:");
                    String yourPassword = sc.nextLine();
                    LoginPage lp = new LoginPage();

                    lp.validation(yourUsername,yourPassword,rp.userData());

                    break;

                case 3:
                    loopEntry='n';
                    break;
            }
            System.out.println("enter yes to continue no to break::");
            loopEntry = sc.nextLine().charAt(0);
        }
    }
}
