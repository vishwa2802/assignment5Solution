import java.util.Arrays;

public class ConvertArray {
    
    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        int totalElements = m * n;
        
        if (original.length != totalElements) {
            return new int[0][0]; // Return an empty 2D array if impossible
        }
        
        int[][] result = new int[m][n];
        
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index];
                index++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        
        int[][] convertedArray = convertTo2DArray(original, m, n);
        
        System.out.println("Converted Array: " + Arrays.deepToString(convertedArray));
    }
}
