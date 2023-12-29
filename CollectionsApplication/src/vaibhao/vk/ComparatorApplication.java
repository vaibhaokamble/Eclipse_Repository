package vaibhao.vk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Player {
	private int id;
	private String name;

	public Player(String name, int id, int run) {
		this.name = name;
		this.id = id;
		this.run = run;
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

	public int compare(Object o1, Object o2) {
		Player p1 = (Player) o1;
		Player p2 = (Player) o2;
		if (p1.getId() > p2.getId()) {
			return 1;
		} else if (p1.getId() < p2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class ComparatorApplication {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Player("ABC", 1, 5000));
		al.add(new Player("MNO", 3, 2000));
		al.add(new Player("PQR", 2, 4000));
		al.add(new Player("STV", 4, 6000));
		Scanner xyz = new Scanner(System.in);
		System.out.println("1:Sort Player By Id");
		System.out.println("2:Sort Player By Run");
		System.out.println("Enter your choice");
		int choice = xyz.nextInt();

		System.out.println("display player record before sorting");
		for (Object obj : al) {
			Player p = (Player) obj;
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getRun());
		}
		switch (choice) {

		case 1:
			SortPlayerById sid=new SortPlayerById();
			Collections.sort(al);
			System.out.println("Display player record after sorting");
			for (Object obj : al) {
				Player p = (Player) obj;
				System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getRun());
			}
			break;
		case 2:
			SortPlayerByRun srun=new SortPlayerByRun();
			Collections.sort(al);
			System.out.println("Display player record after sorting");
			for (Object obj : al) {
				Player p = (Player) obj;
				System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getRun());
			}
			break;
		default:
			System.out.println("Wrong choice");
		}
	}
}
