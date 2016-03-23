package arbrebinaire;

public class VisiteurInfixe implements Visiteur {

	private boolean avecMultiplication=false; //priorité
	@Override
	public void visiter(OperateurUnaire o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visiter(OperateurBinaire o) {
		

	}

	@Override
	public void visiter(Negation n) {
	
		System.out.print("("+n.getOp());
		n.getOpG().accept(this);
		System.out.print(")");

	}

	@Override
	public void visiter(Addition a) {
		
		if (avecMultiplication) System.out.print("(");
		a.getOpG().accept(this);
		System.out.print(a.getOp());
		a.getOpD().accept(this);
		if (avecMultiplication)	System.out.print(")");
	}

	@Override
	public void visiter(Multiplication m) {
		avecMultiplication = true;
		m.getOpG().accept(this);
		System.out.print(m.getOp());
		m.getOpD().accept(this);
		avecMultiplication = false;
	}

	@Override
	public void visiter(Constante c) {
		System.out.print(c.getValeur());
	}

}
