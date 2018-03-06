package UniqueSum;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(uniqueAddition(1,2,3));
		System.out.println(uniqueAddition(3,3,3));
		System.out.println(uniqueAddition(1,1,2));
		System.out.println(uniqueAddition(3,5,9));
	}
	
	public static int uniqueAddition(int a, int b, int c) {
		int total = 0;
		
		if (!(a == b || a == c)) {
			total = a;
		}
		if (!(b == c || b == a)) {
			total = total + b;
		}
		
		if (!(b == c || c == a)) {
			total = total + c;
		}

		return total;
	}

}
