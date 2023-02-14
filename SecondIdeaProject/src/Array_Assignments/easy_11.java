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
                Arrays.asList("computer","silver","phone"),
                Arrays.asList("phone","gold","iphone"));
        //System.out.println(items);
        String ruleKey = "type";
        String ruleValue = "phone";
        int count = 0;
        for (List<String> item : items) {
            if (ruleKey == "type") {
                if (item.get(0) == ruleValue) {
                    count += 1;
                }
            } else if (ruleKey == "color") {
                if (item.get(1) == ruleValue) {
                    count += 1;
                }
            } else if (ruleKey == "name") {
                if (item.get(2) == ruleValue) {
                    count += 1;
                }
            }

        }
        System.out.println(count);
    }
}
