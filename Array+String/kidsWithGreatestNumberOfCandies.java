import java.util.ArrayList;
import java.util.List;

public class kidsWithGreatestNumberOfCandies {
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = -1;
        for(int candy : candies)
        {
            max = Math.max(max, candy);
        }

        for(int j = 0; j<candies.length; j++)
        {
            result.add( candies[j] + extraCandies >= max);
        }

        return result;

    }
}
