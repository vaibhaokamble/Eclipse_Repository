package vaibhao.vk;

class Cube {
	int no;
	float value;

	Cube(int no) {
		this.no = no;
	}

	Cube(float value) {
		this.value = value;
	}

	int getIntCube() {
		return no * no * no;
	}

	float getFloatCube() {
		return value * value * value;
	}

}

public class CubeOverloadingApp {
	public static void main(String x[]) {
		Cube c1 = new Cube(5); // call integer constructor
		Cube c2 = new Cube(5.5f); // call float constructor
		int intCube = c1.getIntCube();
		float floatCube = c2.getFloatCube();
		System.out.println("Cube of integer is " + intCube);
		System.out.println("Cube of float is  " + floatCube);
	}
}
