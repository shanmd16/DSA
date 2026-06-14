package String;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String b =  "abced";

        System.out.println(s.length() == b.length() && (s+s).contains(b));
        // s.length () 5 == b.length() 5  && (abcde+abced).contains(abced) ismey yee check hota h k yee
         //   s k  char ko shift karney k baad     Rotations:
        //
        //abcde
        //bcdea
        //cdeab
        //deabc
        //eabcd
        //
        //s+s = abcdeabcde        isme b kee rotation h kee nhi   (abced) ager h tu Ture nhi to False

    }
}
