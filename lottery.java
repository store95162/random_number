import java.util.*;

public class lottery {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			Map<Integer,Integer> map =  new HashMap<Integer,Integer>();
			lottery obj=new lottery ();
			Map a=obj.mapfunction(map);;
			int m = (int)(Math.random()*8)+1;
			System.out.println(a);
			System.out.println(m);	
		} 
	}
	Map mapfunction (Map map) {
		int i = 1;
		int n=0,m=0;
		while(map.size()<5) {
			n = (int)(Math.random()*38)+1;
			if(map.containsValue(n)) {
				continue;
			}else {
				map.put(i,n);
				i++;
			}	
		}
		return map;
	}
	
}
