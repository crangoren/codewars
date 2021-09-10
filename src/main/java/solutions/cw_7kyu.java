package solutions;

public class cw_7kyu {
    /*ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

    If the function is passed a valid PIN string, return true, else return false.

    Examples
"1234"   -->  true
        "12345"  -->  false
        "a234"   -->  false*/

    public static boolean validatePin(String pin) {

        String regex = "[0-9]+";
        if ( pin.matches(regex) == true && (pin.length() == 4 || pin.length() == 6)) {
//      int intPin = Integer.parseInt(pin.trim());
            return true;
        } else {
            return false;
        }
    }

}

