package tutorial;
//elab-source: SimpleValidator.java
public class SimpleValidator implements PasswordValidator {

    @Override
    public boolean validate(String password) {

        if (password.length() >= 4){
            return true;
        }else{
            return false;
        }

    }
}
