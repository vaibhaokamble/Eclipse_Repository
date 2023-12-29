package vaibhao.vk;

import java.util.LinkedHashSet;

class Player{
	private int id;
	private String name;
	public Player(String name,int  id,int run) {
		this.name=name;
		this.id=id;
		this.run=run;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	private int run;
	
	public boolean equals(Object obj) {
		Player p=(Player)obj;
		if(p.id==this.id && p.name.equals(this.name) && p.run==this.run) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return id*100;
	}
}
public class SetWithUserDefinedObjectApplication {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		Player p1 = new Player("ABC",1,1000);//100
		Player p2 = new Player("MNO",2,2000);//200
		Player p3 = new Player("PQR",3,2000);//300
		Player p4 = new Player("ABC",1,1000);//100
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		for(Object obj:hs) {
			Player p=(Player)obj;
System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun()+"\t"+System.identityHashCode(p));
		}
		
	}

}
