import java.io.*;

class tower {
    /**
     * Return the minimum number of hours needed to destroy all the towers in the circle.
     * 
     * N: the number of towers in the circle
     * P: the list of integers denoting the power level of each tower
     * D: the list of integers denoting the distance to the next tower in the circle
     */
    static long solve(int N, long[] P, long[] D) {
    	long ret=Long.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
        	long t=0;
        	int currt=i;
        	for(int j=0;j<N;j++)
        	{
        		if(t<P[currt])
        		{
        			t+=P[currt]-t;
        		}
        		t+=D[currt];
        		if(currt==N-1)
        		{
        			currt=0;
        		}
        		else
        		{
        			currt++;
        		}
        	}
        	t-=D[currt];
        	ret=Math.min(ret, t);
        	
        	
        }
        return ret;
    }
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            String[] line = in.readLine().split(" ");
            int N = Integer.parseInt(line[0]);

            line = in.readLine().split(" ");
            long[] P = new long[N];
            for (int j = 0; j < N; j++) P[j] = Long.parseLong(line[j]);

            line = in.readLine().split(" ");
            long[] D = new long[N];
            for (int j = 0; j < N; j++) D[j] = Long.parseLong(line[j]);

            out.println(solve(N, P, D));
        }
        out.flush();
    }
}
