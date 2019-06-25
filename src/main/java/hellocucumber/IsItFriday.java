package hellocucumber;

public class IsItFriday {

	static String isItFriday(String today) {
		return "Friday".equalsIgnoreCase(today) ? "TGIF" : "Nope";
	}

}
