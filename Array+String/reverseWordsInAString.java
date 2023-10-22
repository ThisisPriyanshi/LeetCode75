public class reverseWordsInAString {

    //https://leetcode.com/problems/reverse-words-in-a-string/
    public static void main(String[] args) {

        String str = "a good   example";
        System.out.println("Result = " + reverseWords1(str));
        System.out.println("Result2 = " + reverseWords2(str));

    }

    public static String reverseWords1(String s) {

        s = " " + s;
        String myStr = "";
        String word = "";

        for(int i = (s.length()-1); i >=0 ; i--)
        {
            char ch = s.charAt(i);
            if( ch != 32)
                word = ch + word;
            else if( (ch == 32) && (word != ""))
            {
                myStr = myStr + word + " ";
                word = "";
            }
        }
        return myStr;
    }

    public static String reverseWords2(String s) {
        String[] words = s.trim().split("\\s+");
        // "\\s+" means one or more whitespace characters.

        String result = "";

        for(int i = (words.length-1) ; i >=0; i--)
        {
            result = result + words[i] + " ";
        }

        return result.trim();
    }
}
