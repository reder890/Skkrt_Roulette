
import control.Control_Login;
import control.Control_Puntata;
import view.Istruzioni;
import view.Login;
import view.Puntata;
import view.spinRoulette;

public class Main_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l=new Login();
		Puntata p=new Puntata();
		//Istruzioni i=new Istruzioni();
		l.setVisible(true);
		Control_Login cl=new Control_Login(l,p);
	}

}
