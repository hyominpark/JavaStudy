package ch06;

public class Cutoperation {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
//                              2최솟값
//	               1번 연산 3 2 2 0 0 6   >>> 4개
//		           2번 연산 1 0 0 -2 -2 4 >>>> 2개
		while (true) {

			// 1번 최솟값 알아내기
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < stick.length; i++) {
				// min = stick[i] < min;
				// 감소된 요소 중 음수가 존재하므로 최솟값 조건으로 0초과
				if (stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}
//	2번 최솟값으로 배열 요소 감소시키기
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}
//	3번 배열 요소중 0 보다 큰 요소 개수 알아내기
			int count = 0;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if(count == 0) break;
		}
	}
}
