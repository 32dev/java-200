package e057.foreach와_lambda형식을_이용하여_list_출력하기;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<Integer> mmlists = Arrays.asList(1, 6, 22, 23, 33);
		mmlists.forEach(m -> {
			System.out.print(m + "\t");
		});
		System.out.println();
		Consumer<Integer> consume = (Integer m) -> {
			System.out.printf(m + "\t");
		};
		mmlists.forEach(consume);
		System.out.println();
		
	}
}
