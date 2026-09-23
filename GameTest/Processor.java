package GameTest;

import java.util.Scanner;

public class Processor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        CharacterList manager = new CharacterList();
        int choice = -1;

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
            System.out.println("0. Exit program");
            System.out.println("----------------------------------------");
            System.out.print("Please select a function (0-8): ");
            choice = sc.nextInt();
            sc.nextLine();
			

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

