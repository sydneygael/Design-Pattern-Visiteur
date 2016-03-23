package arbrebinaire;

public interface Visiteur {

	void visiter (OperateurUnaire o);
	void visiter (OperateurBinaire o);
	void visiter( Negation n);
	void visiter (Addition a);
	void visiter(Multiplication m);
	void visiter (Constante c);
}
