import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class cowcrossroad2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("maxcross.in"));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("maxcross.out")));
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		boolean[]broken=new boolean[N];
		for(int i=0;i<B;i++)
		{
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			broken[a-1]=true;
		}
		int ret=Integer.MAX_VALUE;
		int prefixSum[]=new int[N+1];
		for(int i=0;i<N;i++)
		{
			prefixSum[i+1]=prefixSum[i];
			if(broken[i])
			{
				prefixSum[i+1]++;
			}
			if(i>K-1)
			{
				ret=Math.min(ret, prefixSum[i+1]-prefixSum[i+1-K]);
			}
			
			
		}
		pw.println(ret);
		pw.close();
		
	}

}
