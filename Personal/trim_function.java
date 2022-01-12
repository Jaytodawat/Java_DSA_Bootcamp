package Personal;

public class trim_function {
    public static void main(String[] args) {
        /*
            *trim() function basically removes the leading and trailing spaces of the string.
            *Note: This method does not eliminate middle spaces.
            *return type of this method is String.
            *it also reduces the length of the string by removing white space
         */
        String str = "   Hello World        ";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.trim().length());
    }
}
