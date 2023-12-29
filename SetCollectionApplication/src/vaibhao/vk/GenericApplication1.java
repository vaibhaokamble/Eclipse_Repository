package vaibhao.vk;

import java.util.ArrayList;

class Data {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	int id;
	float per;
	Data(String name, int id, float per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}

	public String toString() {
		return "[" + name + "," + id + "," + per + "]";
	}
}
public class GenericApplication1 {
	public static void main(String[] args) {
		ArrayList<Data> al = new ArrayList<Data>();
		al.add(new Data("A", 1, 50.5f));
		al.add(new Data("B", 2, 55.5f));
		al.add(new Data("C", 3, 50.5f));
		for (Data d : al) {
			System.out.println(d);
		}
	}
}
