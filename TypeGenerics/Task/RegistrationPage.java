package TypeGenerics.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RegistrationPage{
    private String username;
    private String password;

    RegistrationPage(){}

    RegistrationPage(String username, String password) {
        this.username = username;
        this.password = password;

        System.out.println("Constructor"+username);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    Map userInfo = new HashMap();
    public Map userData(){
        System.out.println("Registration usrrname : " +getUsername());
        userInfo.put(getUsername(),getPassword());
        System.out.println(userInfo);
        return userInfo;
    }



}
