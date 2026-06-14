package String;

public class ScoreOfString {
   public static void main(String[] args) {
       // ASCII values:
       // h = 104
       // e = 101
       // l = 108
       // l = 108
       // o = 111
       String s = "hello";
       int ans=0;

       for(int i=1;i<s.length();i++){
           //ans = ans+Math.abs(s.charAt(i-1)-s.charAt(i));
           ans = ans+Math.abs(s.charAt(i-1)-s.charAt(i));
           // s.charAt(i-1) = s.charAt(0) = 'h'
           // s.charAt(i)   = s.charAt(1) = 'e'
           // h = 104
           // e = 101 // 104 - 101 = 3
           // Math.abs() method
           // Negative number ko positive bana deta hai.
           
       }
       System.out.println(ans);

    }
}
