import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stacking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[]prefixSum=new int[N];
		for(int i=0;i<K;i++)
		{
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken())-1;
			int b=Integer.parseInt(st.nextToken())-1;
			prefixSum[a]++;
			if(b!=N-1)
			{
				prefixSum[b+1]--;
			}
			
		}
		int[]arr=new int[N];
		for(int i=0;i<N;i++){
			if(i!=0) {
				arr[i]=arr[i-1];
			}
			arr[i]+=prefixSum[i];
		}
		Arrays.sort(arr);
		System.out.println(arr[N/2]);
	}

}
