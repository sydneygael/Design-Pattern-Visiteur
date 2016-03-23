package arbrebinaire;

public class ExpressionArithmetique {

	private Noeud racine;

	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		VisiteurPostfixe v = new VisiteurPostfixe();
		System.out.println("\n postfixe:");
		this.racine.accept(v);
	}

	public int calculerValeur() {

		VisiteurCalcul v = new VisiteurCalcul();
		this.racine.accept(v);
		return v.getValeur();
	}

	public int calculerHauteur() {
		VisiteurHauteur v = new VisiteurHauteur();
		this.racine.accept(v);
		return v.getHauteur();
	}

	public void afficherInFixe() {

		VisiteurInfixe v = new VisiteurInfixe();
		System.out.print("\n infixe: ");
		this.racine.accept(v);

	}

	public void afficherPreFixe() {
		VisiteurPrefixe v = new VisiteurPrefixe();
		System.out.print("\n prefixe: ");
		this.racine.accept(v);
	}

}
