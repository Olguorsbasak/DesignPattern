package CreationalPatterns.Factory;

public class Asus implements Computer {

	@Override
	public void name() {
		System.out.println("Computer brand is Asus");
		
		
	}

	@Override
	public void since(int year) {
		System.out.println("Purchase Date: "+year);
		
	}

	/*Asus ve Mac sınıfları computer sınıfından implemente ediliyor
	*aynı özellikleri benzer şekilde sergiledikleri için factory deseni
	uygulanıyor. */
}
