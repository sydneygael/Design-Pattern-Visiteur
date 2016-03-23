package arbrebinaire;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	@Override
	public void accept(Visiteur v) {
		v.visiter(this);
	}

	

}
