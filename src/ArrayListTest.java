import java.util.ArrayList;
import java.util.Arrays; // you need this to use Arrays.asList()

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        for (int i = 0; i < nums.size() - 2; i++){
            nums.set(i, nums.get(i + 1) + nums.get(i + 2));
        }
        System.out.println(nums);
    }
}
