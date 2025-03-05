public class RodCutting {
    public static int cutRod(int[] length, int[] price, int N) {
        int k = length.length; 
        int[][] t = new int[k + 1][N + 1]; 

        // Initialize DP table
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= N; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0; // Base condition (no length or no pieces)
                }
            }
        }

        
        for (int i = 1; i <= k; i++) {         // Items (rod pieces)
            for (int j = 1; j <= N; j++) {     // Remaining length of the rod
                if (length[i - 1] <= j) {
                    t[i][j] = Math.max(price[i - 1] + t[i][j - length[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];     // Skip the current piece
                }
            }
        }

        return t[k][N]; // Maximum obtainable value
    }

    public static void main(String[] args) {
        int length[] = { 4, 2, 3, 6, 5 }; // Available piece lengths
        int price[] = { 8, 9, 6, 7, 10 }; // Prices corresponding to each length
        int N = 4; // Total rod length

        System.out.println("Maximum Obtainable Value is " + cutRod(length, price, N));
    }
}
