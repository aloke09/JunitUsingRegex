package JunitWithRegex;

import java.util.regex.Pattern;

public class ValidRegex
{
    public boolean validMethodF(String fname) {
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]+$");
        return p.matcher(fname).matches();
    }
    public boolean validMethodL(String Lname) {
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]+$");
        return p.matcher(Lname).matches();
    }
    public boolean validMethodMail(String mail) {
        Pattern p =Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}$");
        return p.matcher(mail).matches();
    }
    public boolean validMethodPhno(String phno) {
        Pattern p = Pattern.compile("^[+][9][1][789]{1}[0-9]{9}$");
        return p.matcher(phno).matches();
    }
    public boolean validMethodPassword(String pwd) {
        Pattern p = Pattern.compile("^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=])"+"(?=\\S+$).{8,}$");
        return p.matcher(pwd).matches();
    }
}
