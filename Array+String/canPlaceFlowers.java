public class canPlaceFlowers {
    //https://leetcode.com/problems/can-place-flowers/

    public static boolean canPlaceFlowersBruteforce(int[] flowerbed, int n) {

        int l = flowerbed.length;
        int counter = 0;
        if( l > 1) {
            for (int i = 0; i < l; i++) {
                if (flowerbed[i] == 0) {
                    if (i == 0) {
                        if (flowerbed[i + 1] != 1) {
                            counter++;
                            flowerbed[i] = 1;
                        }
                    } else if (i == l - 1) {
                        if (flowerbed[i - 1] != 1) {
                            counter++;
                            flowerbed[i] = 1;
                        }

                    } else {
                        if ((flowerbed[i + 1] != 1) && flowerbed[i - 1] != 1) {
                            counter++;
                            flowerbed[i] = 1;
                        }

                    }
                }
            }
        }
        else if( (flowerbed[0]) == 0)
        {
            counter = 1;
        }
        else
        {
            counter = 0;
        }

        if ((counter == n) || (counter>n))
            return true;
        else
            return false;
    }

    public static boolean canPlaceFlowersConcise(int[] flowerbed, int n )
    {
        int l = flowerbed.length;

        if(n==0)
            return true;

        for(int i = 0; i < l; i++)
        {
            if((flowerbed[i] == 0) && ((i == 0) || (flowerbed[i-1] == 0)) && ((i == l-1) || (flowerbed[i+1] == 0)))
            {
                flowerbed[i] = 1;
                n--;
                if(n==0)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] flowers = {0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowers, n));
    }
}
