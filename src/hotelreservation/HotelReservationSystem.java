package hotelreservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
	List<Hotel> hotelList = new LinkedList<>();
	Scanner scanner = new Scanner(System.in);

	public void printHello() {
		System.out.println("Welcome to hotel management");
	}

	public void addHotel(String name, int regularRate, int weekendRate) {
		hotelList.add(new Hotel(name, regularRate, weekendRate));
	}

	public void display() {
		System.out.println(hotelList);
	}

	public void userInput() {
		System.out.println("enter dates");
		String date1 = scanner.next();
		String date2 = scanner.next();

	}

	public Hotel findCheapestHotel(String date1, String date2) {
		DayOfWeek day1 = LocalDate.parse(date1).getDayOfWeek();
		DayOfWeek day2 = LocalDate.parse(date2).getDayOfWeek();
	    hotelList.stream().sorted(Comparator.comparing(Hotel -> Hotel.)))
		return null;

	}

	public static void main(String[] args) {

		HotelReservationSystem hRSystem = new HotelReservationSystem();
		hRSystem.printHello();
		hRSystem.addHotel("LakeWood", 110, 90);
		hRSystem.addHotel("BridgeWood", 160, 60);
		hRSystem.addHotel("RidgeWood", 220, 150);
		hRSystem.display();
	}
}
