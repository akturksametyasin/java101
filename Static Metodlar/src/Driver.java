
public class Driver {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		
		System.out.println(Math.pow(2, 3));		//2^3
		System.out.println(Math.sqrt(9));		//9^(1/2)
		System.out.println(Math.min(6, 3));
		System.out.println(Math.max(6, 3));
		
		float f = 1.49f;
		System.out.println(Math.ceil(f));		//sayıyı yukarı yuvarlar
		System.out.println(Math.floor(f));		//sayıyı aşağı yuvarlar
		System.out.println(Math.round(f));		//nereye yakınsa o tarafa yuvarlar
		System.out.println(Math.random() * 10);		//0 dahil 1 hariç arasında bir sayı üretir
	}
}
