public class reverseVowelsOfAString {

    //https://leetcode.com/problems/reverse-vowels-of-a-string/

    public static void main(String[] args) {

        String myString = "hello";
        System.out.println(reverseVowels(myString));


    }

    public static String reverseVowels(String s) {

        char myArr[] = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while(start < end)
        {
            if(isVowel(myArr[start]) && isVowel(myArr[end]))
            {
                char tmp = myArr[start];
                myArr[start] = myArr[end];
                myArr[end] = tmp;
                start++;
                end--;
            }

            else if(isVowel(myArr[start]))// start character is vowel
                end--;

            else if (isVowel(myArr[end])) // end char is vowel
                start++;

            else //both are not vowels
            {
                start++;
                end--;
            }

        }
    return new String(myArr);

    }

    static boolean isVowel(char ch)
    {
        boolean check = switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
        return check;
    }


}
