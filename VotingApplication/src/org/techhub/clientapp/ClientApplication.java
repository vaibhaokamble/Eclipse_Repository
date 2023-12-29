package org.techhub.clientapp;

import java.util.*;

import org.techhub.model.Address;

import org.techhub.model.Voter;

import org.techhub.repository.VoterRepository;

public class ClientApplication {
	
	public static void main(String[] args) {
		VoterRepository voterRepo = new VoterRepository();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("1:Add New Voter");
			System.out.println("2:View All Voter");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter voter Id");
				int vid = xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter voter name");
				String name = xyz.nextLine();
				System.out.println("Enter voter email");
				String email = xyz.nextLine();
				System.out.println("Enter voter contact");
				String contact = xyz.nextLine();
				System.out.println("Enter voter gender");
				String gender = xyz.nextLine();
				System.out.println("Enter voter age");
				int age = xyz.nextInt();
				 Voter v = new Voter();
				   v.setVoterId(vid);
				   v.setName(name);
				   v.setEmail(email);
				   v.setContact(contact);
				   v.setAge(age);
				   v.setGender(gender);
				// address details of voter
				System.out.println("Enter plotno");
				int plotNo = xyz.nextInt();
				System.out.println("Enter wardno");
				int wardNo = xyz.nextInt();
				System.out.println("Enter villater");
				xyz.nextLine();
				String village = xyz.nextLine();
				System.out.println("Enter taluka");
				String taluka=xyz.nextLine();
				System.out.println("Enter district");
				String distrcit=xyz.nextLine();
				System.out.println("Enter state of voter");
				String state=xyz.nextLine();
				Address ad = new Address();
				 ad.setVoterid(vid);
				 ad.setWardNo(wardNo);
				 ad.setPlotNo(plotNo);
				 ad.setVillage(village);
				 ad.setTaluka(taluka);
				 ad.setDistrict(distrcit);
				 ad.setState(state);
				 v.setAddress(ad);
				 boolean b = voterRepo.addNewVoter(v);
				  if(b) {
					  System.out.println("Record Added Success................");
				  }
				  else {
					  System.out.println("Some problem is there........................");
				  }
				break;
			case 2:
				voterRepo.voterDetails();
				break;
			default:
				System.out.println("Wrong choice");
			}
		} while (true);// infinite array
	}
}
