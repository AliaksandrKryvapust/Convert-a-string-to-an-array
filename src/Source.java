import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    String str = "Robin Singh";
        System.out.println(Arrays.equals(stringToArray(str), new String[]{"Robin", "Singh"}));
    }
    public static String[] stringToArray (String s) {
        return s.split(" ");
    }
}
