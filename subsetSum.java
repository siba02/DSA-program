public class subsetSum {
    

        public static void main(String[] args){
            int[] arr = {1, 2, 3, 4, 5,7};
            int target = 10;
            boolean [][] t = new boolean [arr.length + 1][target + 1];
    
            // Correct Initialization

            for (int i = 0; i <= arr.length; i++){
                for (int j = 0; j <= target; j++){
                    if(i==0){
                    t[i][j] = false;
                    }
                   if(j==0){
                    t[i][j] = true;
       
            }
        }
    }
            // for (int i = 0; i <= arr.length; i++) {
            //     t[i][0] = true; 
            // }
    
            // for (int j = 0; j <= target; j++) {
            //     t[0][j] = false; 
            // }
    
            // Fill the DP table
            for (int i = 1; i <= arr.length; i++) {
                for (int j = 1; j <= target; j++) {
                    if (arr[i - 1] <= j) {
                        t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j]; // Include or exclude element
                    } else {
                        t[i][j] = t[i - 1][j]; // Exclude element
                    }
                }
            }
    
            // Print the result
            System.out.println("Subset sum exists: " + t[arr.length][target]);
        }
    }
    