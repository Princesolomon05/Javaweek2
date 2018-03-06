package Cards;

public class Cards {

	public static void main(String[] args) {
		System.out.println(cards(15, 21));
	}
	
	public static int cards(int a, int b) {

		if (a == b) {
			return 0;

		} else if (a > 21 && b > 21) {
			return 0;
		} else {
			if (a > b && a < 22) {
				return a;
			} else {
				if (b > a && b < 22) {
					return b;
				}
			}
			return 0;
		}
	}
}


