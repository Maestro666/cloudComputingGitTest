import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

/**
 * Created by andre on 20.02.2017.
 */

public class EmailValidation {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter email : ");
        String email = br.readLine();
        boolean result = isValidEmail(email);
        if (result) {
            System.out.print(email + " is valid email address.");
        } else {
            System.out.print(email + " is not a valid email address.");
        }


    }

    private static boolean isValidEmail(String email) {
        String str = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern emailPattern = Pattern.compile(str);
        Matcher m = emailPattern.matcher(email);
        return m.matches();
    }
}
