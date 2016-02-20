package davis.john;

/**
 * Created by jrdavis on 2/19/16.
 */
public class DataValidator {

    public boolean isValidUsername(String s) {
        String compare = s;

        if (compare.matches("[a-z]{3,25}")) {
            return true;
        } else {
            return false;
        }


    }

    public boolean isValidEnhancedUsername(String enhanced) {

        String newcompare = enhanced;

        if (newcompare.matches("[a-zA-Z][a-zA-Z0-9_]{3,25}")) {
            return true;

        } else {
            return false;

        }
    }
    public boolean isValidIP(String ip){
        String newip= ip;


        if (newip.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}")) {
            return true;
        }else {
            return false;
        }
    }

    public String isPalindrome(){
        String d = "Palindromes are not a regular language";



        return d;
    }

}

