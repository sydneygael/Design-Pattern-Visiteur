package arbrebinaire;

public class VisiteurHauteur implements Visiteur {

	
	private int hauteurCourante = 0;
	
	@Override
	public void visiter(OperateurUnaire o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visiter(OperateurBinaire o) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * max permet de retenir la hauteur max dans l'arbre
	 */
	private int hauteurMax = 0;
	public int getHauteur() { return hauteurMax; }

	@Override
	public void visiter(Constante c) {
		hauteurCourante += 1;
		if(hauteurCourante > hauteurMax)
			hauteurMax = hauteurCourante;
	}

	@Override
	public void visiter(Negation n) {
		hauteurCourante += 1;
		n.getOpG().accept(this);
	}

	@Override
	public void visiter(Addition a) {
		hauteurCourante += 1;
		int temp = hauteurCourante;
		a.getOpG().accept(this);
		hauteurCourante = temp;
		a.getOpD().accept(this);
	}

	@Override
	public void visiter(Multiplication m) {
		hauteurCourante += 1;
		int temp = hauteurCourante;
		m.getOpG().accept(this);
		hauteurCourante = temp;
		m.getOpD().accept(this);
	}
	

	public int getHauteurCourante() { return hauteurCourante; }
}
