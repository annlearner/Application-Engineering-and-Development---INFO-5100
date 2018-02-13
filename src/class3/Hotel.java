package class3;

import java.util.Scanner;

public class Hotel {

	int maleGuestCount = 0;
	int femaleGuestCount = 0;
	int TOTAL_MAX_GUESTS = 5;

	boolean isReachedMaxCapacity() {
		int totalCount = maleGuestCount + femaleGuestCount;
		if (totalCount >= TOTAL_MAX_GUESTS) {
			return true;
		} else {
			return false;
		}
	}

	void acceptGuestsTillTheMaximumIsReached() {
		System.out.println("-------Accept Guests till the maximum is reached ---");
		Scanner scanner = new Scanner(System.in);
		for (; !isReachedMaxCapacity();) {
			System.out.println("Enter Guest type (male | female) or exit to stop accepting guests");
			String guestType = scanner.nextLine().trim().intern();
			if (guestType == "Male") {
				maleGuestCount++;
				continue;
			}
			if (guestType == "Female") {
				femaleGuestCount++;
				continue;
			}
			if (guestType.equals("Exit")) {
				System.out.println("Done counting - exiting");
				break;
			}
		}
		System.out.println("-------Done Accepting Guests-----");
	}

	void operate() {
		for (int index = 0; index < 3; index++) {
			acceptGuestsTillTheMaximumIsReached();
			displayGuestInformation();
			checkingOutGuests();
			displayGuestInformation();
		}
	}

	boolean isValidCheckout(int genderType, String gender, String GENDER_TYPE) {
		if (gender.equals(GENDER_TYPE)) {
			if (genderType > 0) {
				return true;
			} else {
				System.out.println("No more " + gender + " to be checked out");
				return false;
			}
		}
		return false;
	}

	boolean isValidMaleCheckout(String guestType) {
		return isValidCheckout(maleGuestCount, "Male", guestType);
	}

	boolean isValidFemaleCheckout(String guestType) {
		return isValidCheckout(femaleGuestCount, "Female", guestType);
	}

	void checkingOutGuests() {
		System.out.println("---Check out Guests-----");
		Scanner scanner = new Scanner(System.in);
		for (; true;) {
			System.out.println("Enter Guest type (male | female) or exit to stop checking out guests");
			String guestType = scanner.nextLine();
			if (isValidMaleCheckout(guestType)) {
				maleGuestCount--;
				continue;

			}
			if (isValidFemaleCheckout(guestType)) {
				femaleGuestCount--;
				continue;
			}
			/*
			 * if (guestType.equals("Male")) { if (maleGuestCount > 0) { maleGuestCount--; }
			 * else { System.out.println("No more Male in the Hotel to be checked out"); }
			 * continue; }
			 */
			/*
			 * if (isValidCheckout(maleGuestCount, "Male", guestType)) { maleGuestCount--; }
			 * if (isValidCheckout(femaleGuestCount, "Female", guestType)) {
			 * femaleGuestCount--; }
			 */
			/*
			 * if (guestType.equals("Female")) { if (femaleGuestCount > 0) {
			 * femaleGuestCount--; } else {
			 * System.out.println("No more Female in the Hotel to be checked out"); }
			 * continue; }
			 */
			if (guestType.equals("Exit")) {
				System.out.println("Stop checkout");
				break;
			}
		}
		System.out.println("---Done checking out Guests-----");

	}

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		// hotel.acceptGuests();
		// hotel.acceptGuestsWithoutBreakInWhile();
		// hotel.acceptGuestsTillTheMaximumIsReached();
		// hotel.displayGuestInformation();
		// hotel.acceptGuestsTillTheMaximumIsReached();
		// hotel.displayGuestInformation();
		hotel.operate();
	}

	void displayGuestInformation() {
		System.out.println("Number of Men : " + maleGuestCount + " Number of Women : " + femaleGuestCount);
	}

	void acceptGuests() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Guest type (male | female) or exit to stop accepting guests");
			String guestType = scanner.nextLine();
			if (guestType.equals("Male")) {
				maleGuestCount++;
				continue;
			}
			if (guestType.equals("Female")) {
				femaleGuestCount++;
				continue;
			}
			if (guestType.equals("Exit")) {
				System.out.println("Done counting - exiting");
				break;
			}
		}
	}

	void acceptGuestsWithoutBreakInWhile() {
		Scanner scanner = new Scanner(System.in);
		String guestType = "";
		while (!guestType.equals("Exit")) {
			System.out.println("Enter Guest type (male | female) or exit to stop accepting guests");
			guestType = scanner.nextLine();
			if (guestType.equals("Male")) {
				maleGuestCount++;
				continue;
			}
			if (guestType.equals("Female")) {
				femaleGuestCount++;
				continue;
			}
		}
		System.out.println("I'm done counting");

	}

}
