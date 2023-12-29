package org.vaibhao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Voter {
	String name;
	int age;
	String address;
	String email;
	String contact;
	String voterId;
	String gender;

	public Voter(String name, int age, String address, String email, String contact, String voterId, String gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.contact = contact;
		this.voterId = voterId;
		this.gender = gender;
	}
}

public class VotingApplication {
	static ArrayList<Voter> voters = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("1. Add New Voter");
			System.out.println("2. View All Voters");
			System.out.println("3. View Ward Wise Voter");
			System.out.println("4. View Taluka Wise Voter Count");
			System.out.println("5. View Village Wise Voter Count");
			System.out.println("6. View Age Wise Voter Count");
			System.out.println("7. Delete Voter");
			System.out.println("8. Update Voter");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addVoter();
				break;
			case 2:
				viewAllVoters();
				break;
			case 3:
				viewWardWiseVoter();
				break;
			case 4:
				viewTalukaWiseVoterCount();
				break;
			case 5:
				viewVillageWiseVoterCount();
				break;
			case 6:
				viewAgeWiseVoterCount();
				break;
			case 7:
				deleteVoter();
				break;
			case 8:
				updateVoter();
				break;
			case 0:
				System.out.println("Exiting the application. Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

	private static void addVoter() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Voter Details:");

		System.out.print("Name: ");
		String name = scanner.nextLine();

		System.out.print("Age: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		System.out.println("Enter Address Details:");
		System.out.print("Plot No: ");
		String plotNo = scanner.nextLine();

		System.out.print("Ward: ");
		String ward = scanner.nextLine();

		System.out.print("Village: ");
		String village = scanner.nextLine();

		System.out.print("Taluka: ");
		String taluka = scanner.nextLine();

		System.out.print("District: ");
		String district = scanner.nextLine();

		System.out.print("State: ");
		String state = scanner.nextLine();

		System.out.print("Email: ");
		String email = scanner.nextLine();

		System.out.print("Contact: ");
		String contact = scanner.nextLine();

		System.out.print("Voter ID: ");
		String voterId = scanner.nextLine();

		System.out.print("Gender: ");
		String gender = scanner.nextLine(); // Create a new Voter object with the entered details
		Voter newVoter = new Voter(name, age,
				"Address: " + plotNo + ", " + ward + ", " + village + ", " + taluka + ", " + district + ", " + state,
				email, contact, voterId, gender);

		// Add the new voter to the ArrayList
		voters.add(newVoter);

		System.out.println("Voter added successfully!");// Code to add a new voter to the ArrayList
	}

	private static void viewAllVoters() {
		if (voters.isEmpty()) {
			System.out.println("No voters available.");
		} else {
			System.out.println("All Voters:");

			for (Voter voter : voters) {
				System.out.println("Name: " + voter.name);
				System.out.println("Age: " + voter.age);
				System.out.println("Address: " + voter.address);
				System.out.println("Email: " + voter.email);
				System.out.println("Contact: " + voter.contact);
				System.out.println("Voter ID: " + voter.voterId);
				System.out.println("Gender: " + voter.gender);
				System.out.println("----------------------------");
			}
		}
// Code to display all voters in the ArrayList
	}

	private static void viewWardWiseVoter() {
		if (voters.isEmpty()) {
			System.out.println("No voters available.");
		} else {
			// Use a HashMap to store voters grouped by ward
			Map<String, ArrayList<Voter>> wardWiseVoters = new HashMap<>();

			// Iterate through the voters and group them by ward
			for (Voter voter : voters) {
				String ward = getWardFromAddress(voter.address);

				// Check if the ward is already in the map
				if (!wardWiseVoters.containsKey(ward)) {
					wardWiseVoters.put(ward, new ArrayList<>());
				}

				// Add the voter to the corresponding ward
				wardWiseVoters.get(ward).add(voter);
			}

			// Display voters ward-wise
			System.out.println("Ward Wise Voters:");

			for (Map.Entry<String, ArrayList<Voter>> entry : wardWiseVoters.entrySet()) {
				String ward = entry.getKey();
				ArrayList<Voter> wardVoters = entry.getValue();

				System.out.println("Ward: " + ward);

				for (Voter voter : wardVoters) {
					System.out.println("Name: " + voter.name + ", Voter ID: " + voter.voterId);
				}

				System.out.println("----------------------------");

			}
		}
	}

	// Helper method to extract ward from the address
	private static String getWardFromAddress(String address) {
		// Assuming the ward is the second part in the address string
		String[] parts = address.split(", ");
		if (parts.length > 1) {
			return parts[1];
		} else {
			return "Unknown Ward";
		}
	}
	// Code to display voters ward wise

	private static void viewTalukaWiseVoterCount() {
		if (voters.isEmpty()) {
			System.out.println("No voters available.");
		} else {
			// Use a HashMap to store taluka-wise voter count
			Map<String, Integer> talukaWiseCount = new HashMap<>();

			// Iterate through the voters and count them for each taluka
			for (Voter voter : voters) {
				String taluka = getTalukaFromAddress(voter.address);

				// Update the count in the map
				talukaWiseCount.put(taluka, talukaWiseCount.getOrDefault(taluka, 0) + 1);
			}

			// Display taluka-wise voter count
			System.out.println("Taluka Wise Voter Count:");

			for (Map.Entry<String, Integer> entry : talukaWiseCount.entrySet()) {
				String taluka = entry.getKey();
				int count = entry.getValue();

				System.out.println("Taluka: " + taluka + ", Voter Count: " + count);
			}
		}
	}

	// Helper method to extract taluka from the address
	private static String getTalukaFromAddress(String address) {
		// Assuming the taluka is the third part in the address string
		String[] parts = address.split(", ");
		if (parts.length > 2) {
			return parts[2];
		} else {
			return "Unknown Taluka";
		}
	} // Code to display taluka wise voter count

	private static void viewVillageWiseVoterCount() {
		if (voters.isEmpty()) {
			System.out.println("No voters available.");
		} else {
			// Use a HashMap to store village-wise voter count
			Map<String, Integer> villageWiseCount = new HashMap<>();

			// Iterate through the voters and count them for each village
			for (Voter voter : voters) {
				String village = getVillageFromAddress(voter.address);

				// Update the count in the map
				villageWiseCount.put(village, villageWiseCount.getOrDefault(village, 0) + 1);
			}

			// Display village-wise voter count
			System.out.println("Village Wise Voter Count:");

			for (Map.Entry<String, Integer> entry : villageWiseCount.entrySet()) {
				String village = entry.getKey();
				int count = entry.getValue();

				System.out.println("Village: " + village + ", Voter Count: " + count);
			}
		}
	}

	// Helper method to extract village from the address
	private static String getVillageFromAddress(String address) {
		// Assuming the village is the fourth part in the address string
		String[] parts = address.split(", ");
		if (parts.length > 3) {
			return parts[3];
		} else {
			return "Unknown Village";
		}
	}
	// Code to display village wise voter count

	private static void viewAgeWiseVoterCount() {
		if (voters.isEmpty()) {
			System.out.println("No voters available.");
		} else {
			// Use a HashMap to store age-wise voter count
			Map<Integer, Integer> ageWiseCount = new HashMap<>();

			// Iterate through the voters and count them for each age group
			for (Voter voter : voters) {
				int age = voter.age;

				// Update the count in the map
				ageWiseCount.put(age, ageWiseCount.getOrDefault(age, 0) + 1);
			}

			// Display age-wise voter count
			System.out.println("Age Wise Voter Count:");

			for (Map.Entry<Integer, Integer> entry : ageWiseCount.entrySet()) {
				int age = entry.getKey();
				int count = entry.getValue();

				System.out.println("Age: " + age + ", Voter Count: " + count);
			}
		}
	}
	// Code to display age wise voter count

	private static void deleteVoter() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Voter ID to delete: ");
		String voterIdToDelete = scanner.nextLine();

		Iterator<Voter> iterator = voters.iterator();
		boolean voterFound = false;

		while (iterator.hasNext()) {
			Voter voter = iterator.next();

			if (voter.voterId.equals(voterIdToDelete)) {
				iterator.remove();
				voterFound = true;
				System.out.println("Voter with Voter ID " + voterIdToDelete + " deleted successfully.");
				break;
			}
		}

		if (!voterFound) {
			System.out.println("Voter with Voter ID " + voterIdToDelete + " not found.");
		}
	}
	// Code to delete a voter using voterId

	private static void updateVoter() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Voter ID to update: ");
		String voterIdToUpdate = scanner.nextLine();

		boolean voterFound = false;

		for (int i = 0; i < voters.size(); i++) {
			Voter voter = voters.get(i);

			if (voter.voterId.equals(voterIdToUpdate)) {
				System.out.println("Enter new details for the voter with Voter ID " + voterIdToUpdate + ":");

				System.out.print("Name: ");
				String newName = scanner.nextLine();
				voter.name = newName;

				System.out.print("Age: ");
				int newAge = scanner.nextInt();
				voter.age = newAge;
				scanner.nextLine(); // Consume the newline character

				System.out.println("Enter new Address Details:");
				System.out.print("Plot No: ");
				String newPlotNo = scanner.nextLine();

				System.out.print("Ward: ");
				String newWard = scanner.nextLine();

				System.out.print("Village: ");
				String newVillage = scanner.nextLine();

				System.out.print("Taluka: ");
				String newTaluka = scanner.nextLine();

				System.out.print("District: ");
				String newDistrict = scanner.nextLine();

				System.out.print("State: ");
				String newState = scanner.nextLine();

				voter.address = "Address: " + newPlotNo + ", " + newWard + ", " + newVillage + ", " + newTaluka + ", "
						+ newDistrict + ", " + newState;

				System.out.print("Email: ");
				String newEmail = scanner.nextLine();
				voter.email = newEmail;

				System.out.print("Contact: ");
				String newContact = scanner.nextLine();
				voter.contact = newContact;

				System.out.print("Gender: ");
				String newGender = scanner.nextLine();
				voter.gender = newGender;

				System.out.println("Voter with Voter ID " + voterIdToUpdate + " updated successfully.");
				voterFound = true;
				break;
			}
		}

		if (!voterFound) {
			System.out.println("Voter with Voter ID " + voterIdToUpdate + " not found.");
		}
	}
	// Code to update voter details using voterId
}
