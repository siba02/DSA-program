import java.io.*;

public class Result {
    public static String getSmallestString(String s, int k) {
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            // Calculate the distance to 'a'
            int distanceToA = c - 'a';
            
            if (k >= distanceToA) {
                // We can change this character to 'a'
                result.append('a');
                k -= distanceToA; // Reduce k by the distance used
            } else {
                // We cannot change to 'a', so just reduce the character as much as possible
                result.append((char) (c - k));
                k = 0; // No more distance can be used
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
        String result = getSmallestString(s, k);

        // Write the result to output
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        // Close the resources
        bufferedReader.close();
        bufferedWriter.close();
    }
}

    

