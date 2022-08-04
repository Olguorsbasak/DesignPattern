package CreationalPatterns.AbstractFactory;

public class Client {

	
	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initialize logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}

	public static void main(String [] args){

        ScrollBar bar = (ScrollBar) new YellowThemeScrollBar();
        Window window = (Window) new YellowThemeWindow();

        initializeGUI(bar,window);


        bar = (ScrollBar) new YellowThemeScrollBar();
        window = (Window) new PinkThemeWindow();

        initializeGUI(bar, window);

		
	}
}
