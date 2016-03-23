package arbrebinaire;

public class VisiteurPostfixe implements Visiteur {

	@Override
	public void visiter(OperateurUnaire o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visiter(OperateurBinaire o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visiter(Negation n) {
		n.getOpG().accept(this);
		System.out.print(n.getOp());
	}

	@Override
	public void visiter(Addition a) {
		
		a.getOpG().accept(this);
		a.getOpD().accept(this);
		System.out.print(a.getOp());
		
	}

	@Override
	public void visiter(Multiplication m) {
		m.getOpG().accept(this);
		m.getOpD().accept(this);
		System.out.print(m.getOp());
		
	}

	@Override
	public void visiter(Constante c) {
		System.out.print(c.getValeur());
	}

}
