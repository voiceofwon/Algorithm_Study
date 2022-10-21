import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pinary_number {
    static long[][] dp = new long[91][2];
    static void find(int n){
        dp[1][1] = 1;
        for(int i =2;i<=n;i++){
            dp[i][1] = dp[i-1][0];
            dp[i][0] = dp[i-1][1] + dp[i-1][0];
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        find(N);
        System.out.println(dp[N][0] + dp[N][1]);
    }
}
