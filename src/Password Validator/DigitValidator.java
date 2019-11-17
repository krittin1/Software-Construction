package tutorial;
//elab-source: DigitValidator.java
public class DigitValidator implements PasswordValidator {

    @Override
    public boolean validate(String password) {

        if (password.length() >= 6 && ( password.contains("0") ||  password.contains("1")
        ||  password.contains("2") ||  password.contains("3") ||  password.contains("4")
        ||  password.contains("5") ||  password.contains("6") ||  password.contains("7")
        ||  password.contains("8") ||  password.contains("9"))){
            return true;
        }
        else{
            return false;
        }
    }
}
