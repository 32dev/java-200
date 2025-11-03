package e016.API에서_제공하는_참조_타입_사용하기;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		int [] m = {1, 2, 3};
		int [] n = new int[] {1,2,3};
		String card = "H8";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);
	}
}
