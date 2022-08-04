package CreationalPatterns.Factory;

public class ComputerFactory {
	 @SuppressWarnings("deprecation")
	public static Computer createComputer(@SuppressWarnings("rawtypes") Class aClass) throws IllegalAccessException, InstantiationException {
         return (Computer) aClass.newInstance();
 }
/*ComputerFactory sınıfının bir tane static metodu var bu yordam 
 * diğer sınıfları oluştururken her seferinde tekrar tekrar
 * oluşturmak yerine statik bir biçimde daha optimize olarak 
 * oluşturmaktadır.metod bir tane Class type parametresi alıyor.
 * Bu parametre hangi sınıfı oluştutmak istediğimizi anlamak için
 * ama fabrika sınıfı hangi sınıfı oluşturduğunu bilmiyor sadece
 * Computer interface’inden türeyen bir sınıf olduğunu biliyor, 
 * ki dönüş tipi Computer tipinde.
*/
}
