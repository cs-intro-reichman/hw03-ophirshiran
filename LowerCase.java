/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }
   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
            String newStr="";
               for(int i = 0; i<s.length(); i++){
                    char c= s.charAt(i);
                        if(c>='A' && c<='Z'){
                            c=((char)(c+32));
                        }
                    newStr+=c;
               }
        return newStr;
    }
}