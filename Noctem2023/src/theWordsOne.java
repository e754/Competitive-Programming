import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class theWordsOne {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		
		HashMap<String,ArrayList<String>>child=new HashMap<String,ArrayList<String>>();
		HashMap<String,String>parent=new HashMap<String,String>();
		HashMap<String,Boolean>firstWin=new HashMap<String,Boolean>();
		HashMap<String,Integer>unprocessedChildren=new HashMap<String,Integer>();
		
		
		Stack<String>currvisitList=new Stack<String>();
		
		int N = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			String a=st.nextToken();
			for(int j=1;j<a.length();j++)
			{
				
				String curr=a.substring(0,j);
				String next=a.substring(0,j+1);
				if(child.containsKey(curr))
				{
					child.get(curr).add(next);
				}
				else
				{
					child.put(curr, new ArrayList<String>());
					child.get(curr).add(next);
				}
				
				parent.put(next, curr);
				if(unprocessedChildren.containsKey(curr))
				{
					unprocessedChildren.put(curr, unprocessedChildren.get(curr)+1);
				}
				else
				{
					unprocessedChildren.put(curr, 1);
				}
				
			}
			currvisitList.add(a);
			if(a.length()%2==0){
				firstWin.put(a, true);
			}else {
				firstWin.put(a, false);
			}
			
		}	
		boolean firstcanwin=false;
		while(!currvisitList.isEmpty()) {

			String curr=currvisitList.pop();
			if(parent.containsKey(curr))
			{
				String currparent=parent.get(curr);
				if(firstWin.get(curr))	{				//first wins 
					if(currparent.length()%2!=0)	{	//first's turn
						firstWin.put(currparent, true);
					}
				}
				else    {             //even wins if we go down this path
					if(currparent.length()%2==0) 	{//even's turn
						firstWin.put(currparent, false);
					}
				}
				
				if(unprocessedChildren.get(currparent)==1) {//if only one child left 
					if(!firstWin.containsKey(currparent))
					{
						firstWin.put(currparent, firstWin.get(curr));
						currvisitList.add(currparent);
					}
				}
				else  {
					unprocessedChildren.put(currparent, unprocessedChildren.get(currparent)-1);
				}
			}	
			else
			{
				if(firstWin.get(curr))
				{
					firstcanwin=true;
				}
			}
			

			
			
			
			
		}
		System.out.println(firstcanwin);
	}
}