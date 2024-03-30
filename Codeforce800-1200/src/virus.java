import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class virus {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int cases=0;cases<T;cases++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int input[]=new int[M];
			for(int i=0;i<M;i++)
			{
				input[i]=Integer.parseInt(st.nextToken());
			}
			PriorityQueue<Integer> gaps=new PriorityQueue<Integer>((a, b) -> b - a);
			Arrays.sort(input);
			for(int i=1;i<M;i++)
			{
				gaps.add(input[i]-input[i-1]-1);
			}
			gaps.add((N-input[M-1])+input[0]-1);
			int ret=0;
			int loss=0;
			while(!gaps.isEmpty())
			{
				if(gaps.peek()-loss>0)
				{
					if(gaps.peek()-loss==1)
					{
						ret+=gaps.poll()-loss;
						loss+=2;
					}
					else
					{
						ret+=gaps.poll()-loss-1;
						loss+=4;
					}
				}
				else
				{
					break;
				}
			}
			System.out.println(N-ret);
		}
	}

}
