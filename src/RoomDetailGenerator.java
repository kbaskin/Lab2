import java.util.Scanner;

public class RoomDetailGenerator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double roomLength;
		double roomWidth;
		double roomHeight;
		double roomArea;
		double roomPerimeter;
		double roomVolume;
		String cont;

		System.out.println("Welcome to the Room Detail Generator!");
		System.out.println("Would you like to find the area, perimeter and volume of your room? Enter yes or no.");
		cont = scan.nextLine();

		while (cont.equalsIgnoreCase("Yes")) {

			if (cont.equalsIgnoreCase("No")) {
				break;
			}

			System.out.println("Please enter the length of the room.");
			roomLength = scan.nextDouble();
			System.out.println("Length: " + roomLength);

			System.out.println("Please enter the width of the room.");
			roomWidth = scan.nextDouble();
			System.out.println("Width: " + roomWidth);

			System.out.println("Please enter the height of the room.");
			roomHeight = scan.nextDouble();
			System.out.println("Height: " + roomHeight);

			roomArea = roomLength * roomWidth;
			System.out.println("The area of your room is: " + roomArea);

			roomPerimeter = 2 * (roomLength + roomWidth);
			System.out.println("The perimeter of your room is: " + roomPerimeter);

			roomVolume = roomLength * roomWidth * roomHeight;
			System.out.println("The volume of your room is: " + roomVolume);

			scan.nextLine();
		
			System.out.println("Would you like to find the measurements for another room? Enter yes or no.");
			cont = scan.nextLine();

		}

		System.out.println("Have a nice day!");

		scan.close();
			
	}

}
