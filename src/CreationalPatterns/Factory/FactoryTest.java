package CreationalPatterns.Factory;

public class FactoryTest {

	public static void main(String[] args) {
		try {
            Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
            asus.since(1234);
            asus.name();

            Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
            mac.name();

        } catch (Exception e) {
            e.printStackTrace();
        }
/*interface kullanarak kullanacağınız sınıfları kümeleyebilirsiniz, 
 * bununla birlikte araya bir factory (fabrika) sınıfı ekleyerek 
 * kodunuzu daha soyut bir biçimde daha anlaşılabilir bir biçimde 
 * yazabilirsiniz.
 */

	}

}
