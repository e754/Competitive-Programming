import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class goodSubArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		for(int count=0;count<total;count++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			char input[]= st.nextToken().toCharArray();
			int prefixSum[]=new int[N+1];
			int occuranceCount[]=new int[200001];
			int ret=0;
			for(int i=1;i<N+1;i++) {
				if(i!=0)
					prefixSum[i]+=prefixSum[i-1];
				prefixSum[i]+=Character.getNumericValue(input[i-1]);
				occuranceCount[prefixSum[i]-i+1000]++;
				
			}
			for(int i=0;i<200000;i++)
			{
				ret+=(occuranceCount[i])*(occuranceCount[i]-1)/2;
			}
			System.out.println(ret);
		}
	}	

}
