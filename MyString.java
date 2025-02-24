public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                str = str.substring(0, i) + (char) (str.charAt(i) + 32) + str.substring(i + 1);
            }
        }

        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        // Edge case: str2 is empty, then it's always "contained"
    if (str2.isEmpty()) {
        return true;
    }
    // Edge case: str1 is empty or str2 is longer than str1
    if (str1.isEmpty() || str2.length() > str1.length()) {
        return false;
    }

    // Loop through str1 to find the first character of str2
    for (int i = 0; i <= str1.length() - str2.length(); i++) {
        if (str1.charAt(i) == str2.charAt(0)) {
            // Potential match 
            boolean match = true;
            for (int j = 1; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
    }
    return false;

    }
}
