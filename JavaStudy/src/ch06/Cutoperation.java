package ch06;

public class Cutoperation {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
//                              2�ּڰ�
//	               1�� ���� 3 2 2 0 0 6   >>> 4��
//		           2�� ���� 1 0 0 -2 -2 4 >>>> 2��
		while (true) {

			// 1�� �ּڰ� �˾Ƴ���
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < stick.length; i++) {
				// min = stick[i] < min;
				// ���ҵ� ��� �� ������ �����ϹǷ� �ּڰ� �������� 0�ʰ�
				if (stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}
//	2�� �ּڰ����� �迭 ��� ���ҽ�Ű��
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}
//	3�� �迭 ����� 0 ���� ū ��� ���� �˾Ƴ���
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