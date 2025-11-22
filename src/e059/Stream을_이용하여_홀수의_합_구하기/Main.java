package e059.Stream을_이용하여_홀수의_합_구하기;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
	public static void main(String[] args) {
		int s = 0;
		List<Integer> ilist = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			ilist.add(i);
		}
		s = ilist.stream().reduce(0, Integer::sum);
		System.out.println(s);
		s = ilist.stream().filter(i -> i % 2 == 1).reduce(0, Integer::sum);
		System.out.println(s);
		s = ilist.stream().reduce(0, (x, y) -> (x + y));
		System.out.println(s);
		s = ilist.stream().filter(i -> i % 2 == 1).reduce(0, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer temp, Integer num) {
				return temp + num;
			}

		});
		System.out.println(s);
	}
}
