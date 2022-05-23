import java.util.*;

class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int i = 0;
        while (i<T) {
            i++;
            int n = in.nextInt();
            String oldPassword = in.next();
            System.out.println("Case #" + i + ": " + createNewPassword(oldPassword));
        }
    }

    private static String createNewPassword(String oldPassword) {
        Boolean condition2 = false;
        Boolean condition3 = false;
        Boolean condition4 = false;
        Boolean condition5 = false;
        StringBuilder newPassword = new StringBuilder(oldPassword);
        for (int i = 0; i < oldPassword.length(); i++) {
            if (oldPassword.charAt(i) >= 'A' && oldPassword.charAt(i) <= 'Z')
              condition2 = true;
            else if (oldPassword.charAt(i) >= 'a' && oldPassword.charAt(i) <= 'z')
              condition3 = true;
            else if (oldPassword.charAt(i) >= '0' && oldPassword.charAt(i) <= '9')
              condition4 = true;
            else if (oldPassword.charAt(i) == '@' || oldPassword.charAt(i) == '#' || oldPassword.charAt(i) == '&' || oldPassword.charAt(i) == '*')
              condition5 = true;
        }
    
        if (!condition2) newPassword.append("A"); // Append any uppercase English alphabet letter.
        if (!condition3) newPassword.append("a"); // Append any lowercase English alphabet letter.
        if (!condition4) newPassword.append("1"); // Append any digit.
        if (!condition5) newPassword.append("#"); // Append any special character.
    
        // Append any digit, letter, or a special character.
        while (newPassword.length() < 7) newPassword.append("1");
        return newPassword.toString();
    }
}
