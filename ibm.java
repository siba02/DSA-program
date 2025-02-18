import java.io.*;

public class ibm {

    /*
     * Complete the 'getSmallestString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. INTEGER k
     */
    public static String getSmallestString(String s, int k) {
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            // Correct distance calculation
            int distanceToA = c - 'a';
            
            if (k >= distanceToA) {
                // Change character to 'a'
                result.append('a');
                k -= distanceToA; // Reduce k accordingly
            } else {
                // Reduce the character by k
                result.append((char) (c - k));
                k = 0; // No more modifications possible
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Read input string
        String s = bufferedReader.readLine();
        // Read the integer k
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        // Get the result from the function
        String result = ibm.getSmallestString(s, k); // Fixed function call
        
        // Write the result to output
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        // Close the resources
        bufferedReader.close();
        bufferedWriter.close();
    }
}
