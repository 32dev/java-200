package e030.멤버_메서드를_이용하여_신체_지수_구하기;

public class Main {
	public static final int PHYSICAL = 23;
	public double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days % index )*2 * Math.PI/ index);
	}
	public static void main(String[] args) {
		int days  = 1200;
		Main main = new Main();
		double phyval = main.getBioRhythm(days, PHYSICAL, 100);
		System.out.println(phyval);
	}
}
