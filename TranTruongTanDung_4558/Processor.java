package TranTruongTanDung_4558;

import java.util.Scanner;

public class Processor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CharacterList manager = new CharacterList();
		int choice = -1;
		Character warrior1 = new Attacker("ATK01", "Arthur", 100.0, 3000.0, "Fire Sword", 150.0, 50.0);
		Character warrior2 = new Attacker("ATK02", "Kratos", 120.0, 3400.0, "Leviathan ax", 180.0, 80.0);
		Character mage1 = new Magician("MAG01", "Merlin", 80.0, 2400.0, "Holy Fire Staff", 120.0, 2.5);
		Character mage2 = new Magician("MAG02", "Gandalf", 95.0, 3020.0, "Frost Staff", 110.0, 3.2);
		Character mage3 = new Magician("MAG03", "Voldemort", 3000.0, 650.0, "Dark Wand", 150.0, 2.8);
		manager.addCharacter(warrior1);
		manager.addCharacter(warrior2);
		manager.addCharacter(mage1);
		manager.addCharacter(mage2);
		manager.addCharacter(mage3);

		while (choice != 0) {
			System.out.println("\n========================================");
			System.out.println("   GAME CHARACTER MANAGEMENT SYSTEM");
			System.out.println("========================================");
			System.out.println("1. Add Attacker (Warrior)");
			System.out.println("2. Add Magician (Mage)");
			System.out.println("3. Display all characters");
			System.out.println("4. Find strongest/weakest character");
			System.out.println("5. Count characters by type");
			System.out.println("6. Search character by ID");
			System.out.println("7. Delete character by ID");
			System.out.println("8. Calculate total team combat power");
			System.out.println("9. Update Information");
			System.out.println("0. Exit program");
			System.out.println("----------------------------------------");
			System.out.print("Please select a function (0-8): ");
			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch (Exception E) {
				System.out.println("Wrong value - Input a number please");
				choice = -1;
				sc.nextLine();
			}

			switch (choice) {
			case 1:
				Character attacker = new Attacker();
				attacker.addInfo();
				manager.addCharacter(attacker);
				break;
			case 2:
				Character magician = new Magician();
				magician.addInfo();
				manager.addCharacter(magician);
				break;
			case 3:
				manager.displayAll();
				break;
			case 4:
				manager.maxDamaged();
				manager.minDamaged();
				break;
			case 5:
				manager.countType();
				break;
			case 6:
				System.out.print("Enter ID to search: ");
				String findId = sc.nextLine();
				manager.findCharacterByID(findId);
				break;
			case 7:
				System.out.print("Enter ID to delete: ");
				String delId = sc.nextLine();
				manager.deleteCharacterByID(delId);
				break;
			case 8:
				System.out.printf("\n[TOTAL TEAM COMBAT POWER]: %.1f\n", manager.caculateTeamDameged());
				break;
			case 9:
				System.out.println("Enter id to update: ");
				String updId = sc.nextLine();
				manager.updateInfo(updId);
			case 0:
				System.out.println("Exited the program. Goodbye!");
				break;
			default:
				System.out.println("[ERROR] Invalid choice. Please try again!");
			}
		}
		sc.close();
	}
}
