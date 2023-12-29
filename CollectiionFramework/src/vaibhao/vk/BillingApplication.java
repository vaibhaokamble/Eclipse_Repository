package vaibhao.vk;

import java.util.*;

class Product {
private String name;
private int price;
private int quantity;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getPrice() {
return price;
}
public void setPrice(int price) {
this.price = price;
}
public int getQuantity() {
return quantity;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
}

class Billing {
	 int grandTotal=0;
	void calBill(List list)
	{
	System.out.println("Product Name\tQuantity\tRate\tTotal");
	System.out.println("_______________________________________________________");
	for(Object obj:list)
	{
	Product p =(Product)obj;
	int total = p.getQuantity()*p.getPrice();
	grandTotal = grandTotal + total;
	System.out.println(p.getName()+"\t\t\t"+p.getQuantity()+"\t"+p.getPrice()+"\t"+total);
	}
	System.out.println("______________________________________________________________");
	System.out.println("\t\t\t\tTotal Bill :"+grandTotal);
	}
	}

public class BillingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List al = new ArrayList();
		System.out.println("Enter the Product count");
		Scanner xyz = new Scanner(System.in);
		int size = xyz.nextInt();
		Product p[] = new Product[size];
		for(int i=0; i<p.length;i++)
		{
		p[i]=new Product();
		System.out.println("Enter product name price and quantity");
		xyz = new Scanner(System.in);
		String name=xyz.nextLine();
		int price=xyz.nextInt();
		int quantity=xyz.nextInt();
		p[i].setName(name);
		p[i].setPrice(price);
		p[i].setQuantity(quantity);
		al.add(p[i]);
		}
		Billing b = new Billing();
		b.calBill(al);
	}

}
