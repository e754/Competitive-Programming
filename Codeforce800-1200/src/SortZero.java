import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SortZero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int list[]=new int[N];
			HashMap<Integer, Integer> lastApperanceOf = new HashMap<>();
			HashSet<Integer> nullified=new HashSet<>();
			HashSet<Integer> unique=new HashSet<>(); //unique we encountered so far
			for(int i=0;i<N;i++)
			{
				int a=Integer.parseInt(st.nextToken());
				list[i]=a;
				lastApperanceOf.put(a, i);
			}
			int j=0;
			int nullifyIndex=-1;;
			int potentialnullindex=0;
			int uniques=0;
			int ret=0;
			while(true)
			{
				if(j==N-1)
				{
					break;
				}
				
				if(!unique.contains(list[j]))
				{
					potentialnullindex=Math.max(lastApperanceOf.get(list[j]),potentialnullindex);
					uniques++;
					if(!(j<=nullifyIndex))
					{
						unique.add(list[j]);
					}
				}
				
				if(j<=nullifyIndex)
				{
					if(!unique.contains(list[j]))
					{
						nullifyIndex=Math.max(nullifyIndex, lastApperanceOf.get(list[j]));
						nullified.add(list[j]);
						ret++;
					}
				}
				else
				{
					if(list[j+1]<list[j])
					{
						if(!nullified.contains(list[j]))
						{
							nullified.add(list[j]);
							nullifyIndex=Math.max(nullifyIndex, lastApperanceOf.get(list[j]));
							nullifyIndex=Math.max(nullifyIndex,potentialnullindex);
							ret+=uniques;
							uniques=0;
						}
					}
				}
				unique.add(list[j]);
				j++;
			}
			System.out.println(ret);
		}
	}

}
