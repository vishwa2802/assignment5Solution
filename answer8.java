import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoubledArray {
    
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0]; // Invalid input, not a doubled array
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> originalList = new ArrayList<>();
        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) == 0) {
                continue;
            }
            
            int halfNum = num / 2;
            if (countMap.getOrDefault(halfNum, 0) == 0) {
                return new int[0]; // Invalid input, not a doubled array
            }
            
            originalList.add(halfNum);
            
            countMap.put(halfNum, countMap.get(halfNum) - 1);
            countMap.put(num, countMap.get(num) - 1);
        }
        
        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }
        
        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1,3,4,2,6,8};
        
        int[] original = findOriginalArray(changed);
        
        System.out.print("Original array: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
    }
}
