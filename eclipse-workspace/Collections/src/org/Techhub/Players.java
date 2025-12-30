package org.Techhub;
import java.util.*;
public class Players {
	
	

		public static void main(String args[])
		{
			ArrayList a1=new ArrayList();
			a1.add("r.Sharma");
			a1.add("Pandya");
			a1.add("p");
			
			ArrayList a2=new ArrayList();
			a2.add("M");
			a2.add("j");
			a2.add("k");
			a2.add("n");
			
			LinkedHashMap map=new LinkedHashMap();
			Set<Map.Entry>s=map.entrySet();
			map.put("Ind",a1);
			map.put("aus",a2);
			
			for(Map.Entry e:s)
			{
				String teamName=(String)e.getKey();
				Object value=e.getValue();
				System.out.println("Team Name\t"+"player Name");
				System.out.print(teamName);
				ArrayList ans=(ArrayList)value;
				for(Object o:ans)
				{
					System.out.println(o+" ");
				}
					
			}
			
		}
	

}
