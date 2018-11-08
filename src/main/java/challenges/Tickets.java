package challenges;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Tickets {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		final int conventionOnlyTicket = 209;
		final int conventionAutographTicket = 275;
		final int conventionSuperheroExperienceTicket = 380;
		String typeOfTicket;
		int numOfTickets;
		int cost = 0;
		do {
			System.out.print("-----Comic Convention Tickets-----\n (C) Convention Only Ticket: $209\n (A) Convention + Autographs Ticket: $275\n "
					+ "(S) Convention + Superhero Experience Ticket: $380\n\nWhich type of ticket would you like?: ");
			typeOfTicket = userInput.next();
			if (typeOfTicket.equalsIgnoreCase("C")) {
				do {
					System.out.print("How many tickets would you like?: ");
					try {
						numOfTickets = userInput.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("\nPlease enter the number of tickets you would like.\n");
						userInput.next();
						continue;
					}
				} while (true);
				for (int i = 0; i < numOfTickets; i++) {
					cost += conventionOnlyTicket;
				}
				System.out.println("\n" + numOfTickets + " Convention Only Tickets will cost $" + cost + ".\n");
				break;
			} else if (typeOfTicket.equalsIgnoreCase("A")) {
				do {
					System.out.print("How many tickets would you like?: ");
					try {
						numOfTickets = userInput.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("\nPlease enter the number of tickets you would like.\n");
						userInput.next();
						continue;
					}
				} while (true);
				for (int i = 0; i < numOfTickets; i++) {
					cost += conventionAutographTicket;
				}
				System.out.println("\n" + numOfTickets + " Convention + Autographs Tickets will cost $" + cost + ".\n");
				break;
			} else if (typeOfTicket.equalsIgnoreCase("S")) {
				do {
					System.out.print("How many tickets would you like?: ");
					try {
						numOfTickets = userInput.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("\nPlease enter the number of tickets you would like.\n");
						userInput.next();
						continue;
					}
				} while (true);
				for (int i = 0; i < numOfTickets; i++) {
					cost += conventionSuperheroExperienceTicket;
				}
				System.out.println("\n" + numOfTickets + " Convention + Superhero Experience Tickets will cost $" + cost + ".\n");
				break;
			} else {
				System.out.println("\nPlease enter the type of ticket you would like.\n");
				continue;
			}
		} while (true);
		userInput.close();
	}

}