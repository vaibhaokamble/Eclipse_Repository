package vaibhao.vk;

import java.util.*;

class Player {
	private int id;
	private String name;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int run;
	private int age;
}

public class PlayerDriverApplication {

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
		for (Object obj : v) {

			Player plr = (Player) obj;

			System.out.println(plr.getId() + "\t" + plr.getName() + "\t" + plr.getRun() + "\t" + plr.getAge());
		}

	}

}
