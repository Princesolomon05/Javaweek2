public class tHot {

	public static void main(String[] args) {

		System.out.println(temp(50, 90));

	}

	public static String temp(int a, int b) {

		if (a >= 60 && b <= 90) {

			return "Inclusive";

		} else {

			if (b >= 100) {

				return "True";

			} else {

				return "False";

			}

		}

	}

}
