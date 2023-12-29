package vaibhao.vk;

import java.util.ArrayList;

class Player1 {
	private int id;
	private String name;

	public Player1(String name, int id, int run) {
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

	public String toString() {
		return "[" + name + "," + id + "," + run + "]";
	}
}

public class PlayerApplication {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(new Player("A", 1, 10000));
		al.add(new Player("B", 2, 20000));
		al.add(new Player("C", 3, 30000));
		al.add(new Player("D", 4, 40000));
		al.add(new Player("E", 5, 50000));
		System.out.println(al);

	}
}
