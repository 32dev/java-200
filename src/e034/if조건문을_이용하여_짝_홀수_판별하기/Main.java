package e034.if조건문을_이용하여_짝_홀수_판별하기;

public class Main {
	public static void main(String[] args) {
		int temp = 9999;
		if (temp % 2 == 1) {
			temp = temp + 3 + 1;
		} else {
			temp = temp / 2;
		}
	}
}
