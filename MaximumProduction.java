import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumProduction {
    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
    }

    private static int maxProduction(int days , int x , int y , int z) {
        int regularMax = 7 * x;
        int differentMax = days*y + (7-days)*z;
        return Math.max(regularMax,differentMax);
    }

    public static void main(String[] pg) {
        FastReader fr = new FastReader();
        int testCase = fr.nextInt();
        for (int i = 0 ; i < testCase ; ++i) {
            int days = fr.nextInt();
            int x = fr.nextInt();
            int y = fr.nextInt();
            int z = fr.nextInt();
            System.out.println(maxProduction(days,x,y,z));
        }
    }
}