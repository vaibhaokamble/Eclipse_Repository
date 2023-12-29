package vaibhao.vk;

import java.util.*;
public class PlayerRemove {
	public static void main(String[] args) {
		Vector v = new Vector();
		int size;
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter player count");
		size = xyz.nextInt();
		Player p[] = new Player[size]; // array of reference
		for (int i = 0; i < p.length; i++) {
			xyz.nextLine();
			p[i] = new Player();
			System.out.println("Enter name id run and age of player");
			String name = xyz.nextLine();
			int id = xyz.nextInt();
			int run = xyz.nextInt();
			int age = xyz.nextInt();
			p[i].setName(name);
			p[i].setId(id);
			p[i].setRun(run);
			p[i].setAge(age);
			v.add(p[i]);
		}
		System.out.println("Player list before deletion ");
		for (Object obj : v) {
			Player plr = (Player) obj;
	System.out.println(plr.getId() + "\t" + plr.getName() + "\t" + plr.getRun() + "\t" + plr.getAge());
		}
		//deletion logics
		
		 Iterator i=v.iterator();
		 while(i.hasNext())
		 {
			 Object obj=i.next(); //step1 fetch single single object
			 Player plr=(Player)obj;//convert object class in to player class
			 if(plr.getAge()>35) //step3 fetch age from Player object
			 {
				 i.remove(); //remove player from Vector
			 }
		 }
		System.out.println("Player list after deletion ");
		for (Object obj : v) {
			Player plr = (Player) obj;
	System.out.println(plr.getId() + "\t" + plr.getName() + "\t" + plr.getRun() + "\t" + plr.getAge());
		}
		
		
	}
}
