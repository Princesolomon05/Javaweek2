package code;
public class tHot {

	public static void main(String[] args) {

		System.out.println(tooHot(100, false));

	}

	public static boolean tooHot(int temp, boolean isSummer) {
		
		if (isSummer == true) {
			if(temp >= 60 && temp <=100){
				return true;
			} else {
				return false;
			}
		} else { 
			if(temp >=60 && temp <=90){
				return true;
			
			} else {
				return false;
				}
		}
	}
}