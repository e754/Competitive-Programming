import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class findAndReplace {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			String a=br.readLine();
			String b=br.readLine();
			int ret=0;
			boolean impossible=false;
			HashMap<Character, Character> map = new HashMap<Character, Character>();
			HashMap<Character, Boolean> visited = new HashMap<Character, Boolean>();
			for(int i=0;i<a.length();i++)
			{
				if(!map.containsKey(a.charAt(i)))
				{
					if(a.charAt(i)!=b.charAt(i))
					{
						ret++;
						map.put(a.charAt(i), b.charAt(i));
					}
					visited.put(a.charAt(i), false);
					visited.put(b.charAt(i), false);
				}
				else
				{
					impossible=true;
					break;
				}
			}
			if(!impossible)
			{
				for(char start:a.toCharArray())
				{
					
					if(!visited.get(start))
					{
						char rabbit=start;
						char turtle=start;
						boolean cycle=false;
						HashSet<Character>seen=new HashSet<Character>();
						seen.add(start);
						while(true)
						{
							
							if(map.containsKey(rabbit)&&!visited.get(map.get(rabbit)))
							{

								rabbit=map.get(rabbit);
								seen.add(rabbit);
							} else {
								break;}
							if(map.containsKey(rabbit)&&!visited.get(map.get(rabbit)))
							{
								rabbit=map.get(rabbit);
								seen.add(rabbit);
							} else {
								;break;}
						
							if(map.containsKey(turtle)&&!visited.get(map.get(turtle)))
							{
								turtle=map.get(turtle);
								seen.add(turtle);
							}
							else
							{
								break; //no cycle;
							}
							

							if(rabbit==turtle)
							{
								cycle=true;
								break;		
							}
						}
						if(cycle)
						{
							ret++;
						}
						for(char a1:seen)
						{
							visited.put(a1, true);
						}
						
					}
				}
				System.out.println(ret);
			}
			else
			{
				System.out.println(-1);
			}
		}
	}

}
