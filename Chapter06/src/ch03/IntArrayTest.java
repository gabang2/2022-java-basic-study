package ch03;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();

		// 잘 모르겠다.
		System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a+b));
	}
}
