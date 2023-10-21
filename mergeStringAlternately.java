public class mergeStringAlternately {
    //https://leetcode.com/problems/merge-strings-alternately/

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder str1 = new StringBuilder(word1);
        StringBuilder str2 = new StringBuilder(word2);
        StringBuilder str3 = new StringBuilder();

        int i = 0;

        while( (i < word1.length()) && (i < word2.length()) )
        {
            str3.append(str1.charAt(i));
            str3.append(str2.charAt(i));
            i++;

        }

        if((i < word1.length()))
        {
            str3.append(str1.substring(i));
        }

        else if((i < word2.length()))
        {
            str3.append(str2.substring(i));
        }

        return (str3.toString());
    }

    public static void main(String[] args) {
        String myStr = "abc";
        String myStr2 = "pqrstu";
        String myStr3 = mergeAlternately(myStr, myStr2);
        System.out.println( "Resultant String is " + myStr3);
    }
}
