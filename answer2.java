public class StaircaseRows {
    
    public static int arrangeCoins(int n) {
        int completeRows = 0;
        int coinsNeeded = 1;
        
        while (n >= coinsNeeded) {
            n -= coinsNeeded;
            coinsNeeded++;
            completeRows++;
        }
        
        return completeRows;
    }

    public static void main(String[] args) {
        int n = 5;
        
        int completeRows = arrangeCoins(n);
        
        System.out.println("Number of complete rows: " + completeRows);
    }
}
