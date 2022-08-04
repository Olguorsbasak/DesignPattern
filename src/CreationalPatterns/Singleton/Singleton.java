package CreationalPatterns.Singleton;
public class Singleton {

	private static Singleton instance;//sınıf ile aynı static bir üye
	private Singleton() {}//constructor private bu işlem 
	//new ile nesne oluşturulmasını engeller.
	
	public static Singleton getInstance() {//static üyeye ulaşmak için
		//static bir method
		
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}