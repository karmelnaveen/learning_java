package Array_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//1773. Count Items Matching a Rule
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"Output: 1
//Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
public class easy_11 {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone"));
        //System.out.println(items);
        String ruleKey = "color";
        String ruleValue = "silver";
        int ans = countMatches(items,ruleKey,ruleValue);
        System.out.println(ans);
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type")) {
                if (ruleValue.equals(item.get(0))) {
                    count += 1;
                }
            } else if (ruleKey.equals("color")) {
                if (ruleValue.equals(item.get(1))) {
                    count += 1;
                }
            } else if (ruleKey.equals("name")) {
                if (ruleValue.equals(item.get(2))) {
                    count += 1;
                }
            }

        }
        return count;
    }
}
