package TypeGenerics.Task;

import java.util.HashMap;
import java.util.Map;

public class LoginPage {
//    public static void main(String[] args) {
//        RegistrationPage rg = new RegistrationPage();
//            Map<String,String> userInfo = new HashMap<>();
//            userInfo.put(rg.getUsername(),rg.getPassword());
//
//
//    }
    public void validation(String username, String password,Map newInfo){
        if(password.equals(newInfo.get(username))){
            System.out.println("Login sucessful");
        }else{
            System.out.println("Unable to login");
        }


    }

}
