package Lambda;

public class Task4 {
    public static void main(String[] args) {
        LengthOfString lengthOfString = ((str1,str2) -> {
            if (str1.length()>str2.length())
            return str1;
            else{
                return str2;
            }
        } );
        System.out.println(lengthOfString.longestString("asa","asas"));
    }
}
