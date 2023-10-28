public class isSubsequence {

    public boolean isSubsequence(String s, String t) {

        int pointerS = 0;
        int pointerT = 0;
        int chFound = 0;

        while(pointerT < t.length() && pointerS < s.length())
        {
            char ch = s.charAt(pointerS);
            if(t.charAt(pointerT) == ch)
            {
                pointerS++;
                pointerT++;
                chFound++;
            }
            else
            {
                pointerT++;
            }
        }

        if (chFound == s.length())
            return true;

        return false;

    }
}
