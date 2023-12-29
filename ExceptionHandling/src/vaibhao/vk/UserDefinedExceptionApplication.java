package vaibhao.vk;

import java.util.*;

class Adhar
{
	private String adharNumber ;
	public Adhar(String name2, String adharNo, String dob2, String address2) {
		// TODO Auto-generated constructor stub
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	private String name;
	private String address;
	private String dob;

}

class AdmissionException extends ArithmeticException
{
	public String getAdmissionError()
	{
		return "Invalid admission age";
		
	}
}

class EnrollNewAdmission
{
	public void newAdmission(Adhar adhar)
	{
		Date d = new java.util.Date();
		String s = d.toLocaleString();
		String str[]=s.split(",");
		String year[]=str[0].split("-");
		String dob=adhar.getDob();
		String udob[]=dob.split("-");
		int age=Integer.parseInt(year[2])-Integer.parseInt(udob[2]);
		if (age<6) 
		{
			AdmissionException ae=new AdmissionException();
			throw ae;
		}
		else 
		{
			System.out.println("Welcome in School");
		}
	}
}
public class UserDefinedExceptionApplication {

	public static void main(String[] args) {
		Scanner vk = new Scanner(System.in);
		System.out.println("Enter te dob(date-month-year) address and adhar number of students");
		String name=vk.nextLine();
		String dob = vk.nextLine();
		String address=vk.nextLine();
		String adharNo = vk.nextLine();
		
		Adhar a =new Adhar(name,adharNo,dob,address);

		try {
			EnrollNewAdmission adm=new EnrollNewAdmission();
			adm.newAdmission(a);
		} catch (AdmissionException e) {
			// TODO: handle exception
			System.out.println(e.getAdmissionError());
		}
	}

}
