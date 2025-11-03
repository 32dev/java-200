package e018.문자열을_실수로_변환하기;

public class Main {
	public static void main(String[] args) {
		String slat = " 37.52127220511242";
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);
	}
}
