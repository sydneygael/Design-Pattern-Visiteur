package test;

import arbrebinaire.Addition;
import arbrebinaire.Constante;
import arbrebinaire.ExpressionArithmetique;
import arbrebinaire.Multiplication;
import arbrebinaire.Negation;

public class TestArbreBinaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//faire 1+2*3+-4=3
		Addition racine = new Addition(new Addition(new Constante(1),
					new Multiplication(new Constante(2),new Constante(3))),
					new Negation(new Constante(4)));
		ExpressionArithmetique exp = new ExpressionArithmetique(racine);

		exp.afficherInFixe();
		System.out.println("\n calcul valeur: " + exp.calculerValeur());
		System.out.println("\n calcul hauteur: " + exp.calculerHauteur());
		exp.afficherPostFixe();
		exp.afficherPreFixe();
		
		//faire (2+3)*4=20
		System.out.println("\n\n -------------------- ");
		System.out.println("\n Pour (2+3)*4=20 ");
		
		Multiplication racine2 = new Multiplication(
									new Addition(new Constante(2),new Constante(3)),
									new Constante(4)
								);
		exp = new ExpressionArithmetique(racine2);

		exp.afficherPostFixe();
		System.out.println("\n\n calcul valeur: " + exp.calculerValeur());
		System.out.println("\n calcul hauteur: " + exp.calculerHauteur());
		exp.afficherInFixe();
		exp.afficherPreFixe();
		
		

	}

	

}
