package ch05;

public class Exam5_4 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		// 코드 작성 이중 반복문
//		int count = 0; 
		for (int i = 0; i < arr.length; i++) {
			 for(int j = 0; j< arr[i].length; j++) {
				 arr[i][j] = (i * 3) + (j + 1);
//				 count++;
//				 arr[i][j] = count;
			 }
		 }
		
		/* 입력된 내용 출력 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
