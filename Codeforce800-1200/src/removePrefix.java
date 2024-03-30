import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class removePrefix {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			int ret=0;
			int N=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			HashMap<Integer, Integer> firstSeen = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> prevSeen = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
			for(int j=0;j<N;j++)
			{
				int a=Integer.parseInt(st.nextToken());
				if(count.containsKey(a))
				{
					count.put(a, count.get(a)+1);
					if(count.get(a)==2)
					{
						ret=Math.max(ret,firstSeen.get(a)+1);
					}
					else if(count.get(a)>2)
					{
						ret=Math.max(ret, prevSeen.get(a)+1);
					}
					prevSeen.put(a, j);
				}
				else
				{
					count.put(a,1);
					firstSeen.put(a, j);
					prevSeen.put(a, j);
				}
			}
			System.out.println(ret);
		}
		
	}

}
