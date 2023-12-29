package vaibhao.vk;

class Test extends java.lang.Object {
	int no;

	Test(int x) {
		no = x;
	}

	public boolean equals(Object obj) {
		Test tt = (Test) obj;
		if (this.no == tt.no) {
			return true;
		} else {

			return false;
		}
	}

	public int hashCode() {
		return no * 100;
	}
}

public class ObjectClassTestApp {
	public static void main(String[] args) {
		Test t1 = new Test(100);
		Test t2 = new Test(200);
		System.out.println("JVM Hashcode of t1  " + System.identityHashCode(t1));
		System.out.println("JVM HashCode of t2  " + System.identityHashCode(t2));

		if (t1.equals(t2)) // hashcode of t1 ==hashcode of t2
		{
			System.out.println("Objects are equal");
			System.out.println("User Hashcode t1 " + t1.hashCode());
			System.out.println("User Hashcode t2 " + t2.hashCode());
		} else {
			System.out.println("Objects are not equal");
			System.out.println("User Hashcode t1 " + t1.hashCode());
			System.out.println("User Hashcode t2 " + t2.hashCode());
		}

	}
}
