package TranTruongTanDung_4558;

import java.util.ArrayList;

public class CharacterList {
	private ArrayList<Character> list;

	public CharacterList() {
		this.list = new ArrayList<>();
	}

	public void addCharacter(Character character) {
		this.list.add(character);
		System.out.println("[INFO] Character added successfully!");
	}

	public void displayAll() {
		if (list.isEmpty()) {
			System.out.println("Emty - Please add data");
			return;
		}
		System.out
				.println("\n=========================================================================================");
		System.out.printf("%-10s | %-15s | %-10s | %-10s | %-10s | %-25s\n", "ID", "Name", "Class", "HP", "Damage",
				"Weapon");
		System.out.println("-----------------------------------------------------------------------------------------");
		for (Character c : list) {
			c.displayInfo();
		}
		System.out.println("=========================================================================================");
	}

	public void maxDamaged() {
		if (list.isEmpty()) {
			System.out.println("Emty - Please add data");
			return;
		}
		Character maxCharacter = list.get(0);
		double maxDameged = list.get(0).damegedCaculate();
		for (int i = 1; i < list.size(); i++) {
			if (maxDameged < list.get(i).damegedCaculate()) {
				maxDameged = list.get(i).damegedCaculate();
				maxCharacter = list.get(i);
			}
		}

		System.out.println("\n[CHARACTER WITH MAXIMUM DAMAGE]");
		maxCharacter.displayInfo();
	}

	public void minDamaged() {
		if (list.isEmpty()) {
			System.out.println("Emty - Please add character");
			return;
		}

		Character min = list.get(0);
		Character minCharacter = list.get(0);
		double minDameged = list.get(0).damegedCaculate();
		for (int i = 1; i < list.size(); i++) {
			if (minDameged > list.get(i).damegedCaculate()) {
				minDameged = list.get(i).damegedCaculate();
				minCharacter = list.get(i);
			}
		}
		System.out.println("\n[CHARACTER WITH MINIMUM DAMAGE]");
		minCharacter.displayInfo();
	}

	public void countType() {
		if (list.isEmpty()) {
			System.out.println("Emty - Please add character");
			return;
		}
		int countAttacker = 0;
		int countMagician = 0;
		for (Character c : list) {
			if (c instanceof Attacker) {
				countAttacker++;
			} else if (c instanceof Magician) {
				countMagician++;
			}
		}
		System.out.printf("\n[STATISTICS] Attacker: %d | Magician: %d\n", countAttacker, countMagician);
	}

	public void findCharacterByID(String id) {
		if (list.isEmpty()) {
			System.out.println("Emty - Please add character");
			return;
		}
		for (Character c : list) {
			if (c.getId().equals(id)) {
				System.out.println("\n[SEARCH RESULT]");
				c.displayInfo();
				return;
			}
		}
		System.out.println("\nCan't Find");
	}

	public void deleteCharacterByID(String id) {
		if (list.isEmpty()) {
			System.out.println("Emty - Please add character");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equalsIgnoreCase(id)) {
				list.remove(i);
				System.out.println("\nDeleted");
				return;
			}
		}
		System.out.println("\nCan't Find To Deleted");
	}

	public double caculateTeamDameged() {
		if (list.isEmpty()) {
			System.out.println("Emty - Please add character");
			return 0;
		}
		double total = 0;
		for (Character c : list) {
			total += c.damegedCaculate();
		}
		return total;
	}

	public void updateInfo(String id) {
		if (list.isEmpty()) {
			System.out.println("Emty - Please add character");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				list.get(i).updateInfo();
				System.out.println("Update completely");
				return;
			}
		}
		System.out.println("Can't find ID");
	}
}
