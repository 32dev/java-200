package e036.입력받은_정수값에_따라_신체_감정_지성값_출력하기;

public class Main {
	public static String textInfor(int index, double value) {
		String result = "";
		switch (index) {
		case 23:
			result = "신체 지수";
			break;
		case 28:
			result = "감정 지수";
			break;
		case 33:
			result = "지성 지수";
			break;
		}
		return result + (value * 100);
	}

	public static void main(String[] args) {
		int index = 23;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);
	}
}
