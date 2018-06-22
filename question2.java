package collections;
import java.util.*;
import java.util.Map.Entry;
public class question2 {
	public static void main(String args[])
	{
		HashMap<String,Integer>m=new HashMap<>();
		m.put("a", 1);
		m.put("b",2);
		m.put("c",3);
		m.put("d",4);
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		int n=sc.nextInt();
		for(Map.Entry<String,Integer> e:m.entrySet())
		{
			if(c.equals(e.getKey()))
		{
			m.put(c,n);
		}
		}
		System.out.println(m);
	}

}
