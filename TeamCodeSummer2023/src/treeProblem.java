import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class treeProblem {
	static long[] dp;
	static BigInteger[] val;
	static long[] runningSiblingSum;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		dp=new long[100000];
		dp[1]=0L;
		dp[2]=3;
		val=new BigInteger[100000];
		val[1]=0;
		val[2]=8;
		runningSiblingSum=new long[100000];
		runningSiblingSum[2]=2;
		long mod=(long) (Math.pow(10, 9)+7);
		System.out.println(mod);
		for(int i=3;i<N+1;i++)
		{
			
			
			dp[i]= ((dp[i-1]+(long)Math.pow(2, i-1)-1));
			
			
			runningSiblingSum[i]+=((long)Math.pow(2, i-2))*(2*(i-1));
			runningSiblingSum[i]+=runningSiblingSum[i-1];
			
			val[i]= (((2*dp[i])+runningSiblingSum[i])*((long)Math.pow(2, i-1)))%mod;
			val[i]+=val[i-1];
			
			val[i]=val[i]%mod;
			dp[i]+=runningSiblingSum[i];
			
		}
		System.out.println(val[N]%mod);
		
	}

}
