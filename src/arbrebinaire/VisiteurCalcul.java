package arbrebinaire;

public class VisiteurCalcul implements Visiteur {

	private int valeur;
	public int getValeur() { 
		return valeur; 
	}

	@Override
	public void visiter(OperateurUnaire o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visiter(OperateurBinaire o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visiter(Constante c) {
		valeur = c.getValeur();
	}

	@Override
	public void visiter(Negation n) {
		n.getOpG().accept(this);
		valeur = -valeur;
	}

	@Override
	public void visiter(Addition a) {
		int temp;
		a.getOpG().accept(this);
		temp = valeur;
		a.getOpD().accept(this);
		valeur = temp + valeur;
	}

	@Override
	public void visiter(Multiplication m) {
		int temp;
		m.getOpG().accept(this);
		temp = valeur;
		m.getOpD().accept(this);
		valeur = temp * valeur;
	}

}
