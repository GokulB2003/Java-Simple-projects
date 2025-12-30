package org.MapInterface;
import java.util.*;
public class MainClass {
	public static void main(String args[])
	{
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		
		a1.add(new Player(1,"Sagar",20));
		a1.add(new Player(2,"Magar",30));
		a1.add(new Player(3,"Gagar",40));
		a1.add(new Player(4,"Trigar",50));
		
		a2.add(new Player(1,"Maxvell",20));
		a2.add(new Player(2,"Maxvell",30));
		a2.add(new Player(3,"Maxvell",40));
		a2.add(new Player(4,"Maxvell",50));
		
		LinkedHashMap map=new LinkedHashMap();
		map.put("Ind",a1);
		map.put("aust",a2);
		
		Set<Map.Entry>s=map.entrySet();
		
		for(Map.Entry a:s)
		{
			String teamName=(String)a.getKey();
			System.out.println("Team name:"+teamName);
			Object obj=a.getValue();
			ArrayList ar=(ArrayList)obj;
		
			for(Object o:ar)
			{
				Player p=(Player)o;
				System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			}
			
		}
		
		
		
		
	}
}
