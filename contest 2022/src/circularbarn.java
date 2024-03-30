import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class circularbarn {

	static int num=5000000;
	static boolean[]sieve;
	static class edge implements Comparable<edge>
	{
		int completionCycle,i;
		boolean John;
		public edge(int completionCycle,int i,boolean John) 
		{
			this.completionCycle=completionCycle;
			this.i=i;
			this.John=John;
		}
		public int compareTo(edge o) 
		{
			if(completionCycle==o.completionCycle)
			{
				return i-o.i;
				
			}
			return completionCycle-o.completionCycle;
		}
	}
	public static int cycleCount(int input,boolean john)
	{
		if(!sieve[input])
		{
			return 0;
		}
		if(john)
		{
			int i=0;
			while(i<input)
			{
				if(!sieve[input-i])
				{
					return i/4+1;
				}
				i+=4;
			}
		}
		else
		{
			return (input/4)+1;
		}
		
		return input;
	}
	public static void main(String[] args) throws IOException {
		
		sieve=new boolean[num];

	    for (int i=2; i< Math.sqrt(num); i++) 
	    {  
	    	if(sieve[i] == false) 
	    	{
	    		for(int j = (i*i); j<num; j = j+i) 
	    		{  
	    			sieve[j] = true;  
	            }  
	         }  
	     }   
		
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			edge[]barn=new edge[N];
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++)
			{
				int a=Integer.parseInt(st.nextToken());
				boolean john=true;
				if(a%4==0)
				{
					john=false;
				}
				barn[j]=new edge(cycleCount(a,john),j,john);
			}
			Arrays.sort(barn);
			if(barn[0].John)
			{
				System.out.println("Farmer John");
			}
			else
			{
				System.out.println("Farmer Nhoj");
			}
		}
	}

}
