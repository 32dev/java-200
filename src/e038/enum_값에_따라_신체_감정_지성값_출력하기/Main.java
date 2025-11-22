package e038.enum_값에_따라_신체_감정_지성값_출력하기;

enum PEI {
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);

	private final int peiValue;

	PEI(int pei) {
		this.peiValue = pei;
	}

	public int getPei() {
		return peiValue;
	}

}

enum FRUIT {
	APPLE, BANANA, MANGO
}

public class Main {
	public static String textInfor(PEI index, double value) {
		String result = "";
		switch (index) {
		case PHYSICAL:
			result = "신체지수:";
			break;

		case EMOTIONAL:
			result = "감정지수:";
			break;

		case INTELLECTUAL:
			result = "지성지수:";
			break;
		default:
			result = "미결정:";
			break;
		}
		return result + (value * 100);
	}
	public static void main(String[] args) {
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println("신체 지수 주기값"+index.getPei());
		String st = textInfor(index, value);
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}
}