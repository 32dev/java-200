package e035.삼항연산자를_이용하여_짝_홀수_판별하기;

public class Main {
	public static void main(String[] args) {
		int temp = 99;
		temp = (temp % 2 == 1) ? temp * 3 + 1 : temp / 2;
		System.out.printf("계산 후 = %d", temp);
	}
}
