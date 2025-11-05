package e027.연산자를_이용하여_바이오리듬_값_구하기;

public class Main {
	public static final int PHYSICAL = 23;

	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(Math.toDegrees(vals) + "도");
	}
}
