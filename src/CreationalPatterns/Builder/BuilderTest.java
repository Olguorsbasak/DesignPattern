package CreationalPatterns.Builder;

public class BuilderTest {

	public static void main(String[] args) {
		Company2 company2 =new Company2.Builder().name("Mac").phone("11111111").address("Türkiye").build();
		//System.out.println(company2);
	}

}
