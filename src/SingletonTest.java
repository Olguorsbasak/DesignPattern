
public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton1= Singleton.getInstance();//new ile instance üretilmiyor.getInstance alınıyor onun yerine
		Singleton singleton2= Singleton.getInstance();
		
		System.out.println("Singleton example 1==>"+ singleton1);
		System.out.println("Singleton example 2==>"+ singleton2);
		
		System.out.println(singleton1==singleton2);

		
		/*Program her çalıştırıldığında aynı adresi verir. 
		 * örnek bir lazy initializatondr getInstance methodu çağrılana
		 * kadar instance yaratılamaz.
		 * 
		 */
	}

}
