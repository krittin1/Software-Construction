package tutorial;

//elab-source: RegistrationSystem.java
import java.util.ArrayList;

public class RegistrationSystem {

    private ArrayList<User> userList = new ArrayList<>();

    private PasswordValidator validator;

    public void setPasswordValidator(PasswordValidator validator) {
        this.validator = validator;

    }

    public boolean register(String username, String password) {
        boolean validated = validator.validate(password);
        if (validated) {
            userList.add(new User(username, password));
        }
        return validated;

    }

    public ArrayList<User> getUsers() {
        return userList;
    }

}