package vaibhao.vk;

class BankingRules {
	int minAmount = 500;

	final void custDoc() {
		System.out.println("Adhar/pan/light bill/index2");
	}

	void openBal() {
		System.out.println("Minimum amount is :" + minAmount);
	}
}

class CooperativeBank extends BankingRules {
	void openBal() {
		minAmount = 1000;
		System.out.println("Minimum amount is :" + minAmount);
	}
}

class NationalBank extends BankingRules {

	void openBal() {
		minAmount = 10000;
		System.out.println("Minimum amount is :" + minAmount);
	}
}

public class FinalMethodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CooperativeBank b = new CooperativeBank();
		b.custDoc();
		b.openBal();

		NationalBank n = new NationalBank();
		n.custDoc();
		n.openBal();

	}

}
