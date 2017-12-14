import model.*;
import view.Finestra;

public class Main {

	public static void main(String[] args) {
		
		
		Estrazione e=new Estrazione();
		Finestra f=new Finestra();
		f.setVisible(true);
		new Thread(new TuttoFareThread(e, f)).start();;
		
		
		
		
	}
	

}
