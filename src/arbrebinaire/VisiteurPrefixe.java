package arbrebinaire;

public class VisiteurPrefixe implements Visiteur {

	@Override
	public void visiter(OperateurUnaire o) {
		// Nothing to do

	}

	@Override
	public void visiter(OperateurBinaire o) {
		// Nothing to do

	}

	@Override
	public void visiter(Addition a)
	{
		System.out.print(a.getOp());
		a.getOpG().accept(this);
		a.getOpD().accept(this);
	}

	@Override
	public void visiter(Multiplication m)
	{
		System.out.print(m.getOp());
		m.getOpG().accept(this);
		m.getOpD().accept(this);
	}

	@Override
	public void visiter(Negation n)
	{
		System.out.print(n.getOp());
		n.getOpG().accept(this);
	}

	@Override
	public void visiter(Constante c)
	{
		System.out.print(c.getValeur());
	}

}
