package e60.stream과_map을_이용하여_홀수에_대한_제곱의_합_구하기;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		ilist = ilist.stream()
				.filter(i -> i % 2 == 1)
				.map(i -> i * i)
				.collect(Collectors.toList());
		
		ilist.forEach(i->{System.out.println(i);});
		System.out.println();
		s = ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~10 사이의 홀수에 대한 제곱합:"+s);
	}
}
