package ch03;

public class Operation1 {
	public static void main(String[] args) {
		// ���ﶧ ctrl + d ���� ctrl + alt + ȭ��ǥ
		int a = 10;
		a = -a;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a); // -9
		System.out.println(++a); // -8
	}
}