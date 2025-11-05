package e031.상수의_묶음_클래스_enum_사용하기;

enum FRUIT {
	APPLE, BANANA, MANGO
}

public class Main{
	public static void main(String[] args) {
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());
		System.out.println(pear2.ordinal());
		FRUIT [] fruits = FRUIT.values();
		System.out.println(fruits[0]);
	}
}