
public class Driver {

	public static void main(String[] args) {
		/*
		int x = 10;
		float y = 20;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		System.out.println(8 % 3);		//kalanı verir
		System.out.println(5 % 2);		//sayının tek veya çift olduğunu anlamak için kullanılır
		
		int a = 10;
		//a = a + 2;
		a += 2;
		System.out.println(a);
		
		int q = 12;
		//System.out.println(q++);
		System.out.println(q);
		System.out.println(++q);
		*/
		int i = 10;		//00000000 00000000 00000000 00001010		2^3 + 2^1
		int x = 4;		//00000000 00000000 00000000 00000100
		
		System.out.println(~i);		//11111111 11111111 11111111 11110101
		System.out.println(i & x);		//00000000 00000000 00000000 00000000		
		System.out.println(i | x);		//00000000 00000000 00000000 00001110		2^3 + 2^2 + 2^1
		System.out.println(x >> 1);		//00000000 00000000 00000000 00000010		1 defa sağa kayar, sağdaki silinip en başa bir tane sıfır eklenir		2^1  
		System.out.println(x << 1);		//00000000 00000000 00000000 00001000		1 defa sola kayar, soldaki silinip sağa bir tane sıfır eklenir		2^2
		
		/*
		0 & 0 = 0
		0 & 1 = 0
		1 & 0 = 0
		1 & 1 = 1
		 */
		
		/*
		0 | 0 = 0
		0 | 1 = 1
		1 | 0 = 1
		1 | 1 = 1
		 */
		
	}
}
