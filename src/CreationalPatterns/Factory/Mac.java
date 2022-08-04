package CreationalPatterns.Factory;

public class Mac implements Computer{

	@Override
	public void name(){
		System.out.println("Computer brand is Mac");
	}
	@Override
	public void since(int year) {
		System.out.println("Purchase Date: "+year);
	}
}
