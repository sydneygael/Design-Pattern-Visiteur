package arbrebinaire;

/*
 * cette classe repr�sente dans le design pattern VISITOR
 * ELEMENT
 */

public interface Noeud {

	void accept(Visiteur v);
	
}
