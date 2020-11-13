import java.util.*;

public class Main {

    public static void main(String[] args) {
       int[] nums = {-1,0,1,2,-1,-4};

        Map<Integer, Integer> map = new HashMap();
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            map.put(nums[i], 0);
            for (int j = i + 1; j < nums.length -1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 & !map.containsKey(nums[k])) {
                            lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        for (List<Integer> i : lists) {
            i.forEach(n -> System.out.print(n + " "));
            System.out.println();




        }
    }
}
