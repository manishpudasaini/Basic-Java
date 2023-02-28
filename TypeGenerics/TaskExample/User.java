package TypeGenerics.TaskExample;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;


public class User {


    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter your username::");
        String username =sc.nextLine();

        System.out.println("enter your password::");
        String password = sc.nextLine();
        Register rg = new Register(username,password);
        Map<String,String> userInfo = new HashMap<>();
        userInfo.put(username,password);

        char loopEntry='y';
        while (loopEntry == 'y'){
            System.out.println("Enter 1.Login");
            System.out.println("Enter 2.Exit");

            int choice =sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter your username:");
                    String yourUsername =sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter you password:");
                    String yourPassword = sc.nextLine();

                    if(yourPassword.equals(userInfo.get(username))){
                        System.out.println("Login successful....");
                    }else {
                        System.out.println("Unable to login***********");
                    }

                    break;

                case 2:
                    loopEntry='n';
                    break;
            }
            System.out.println("enter yes to continue no to break::");
            loopEntry = sc.nextLine().charAt(0);
        }


    }
}
