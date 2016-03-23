package arbrebinaire;

/*
 * cette classe représente dans le design pattern VISITOR
 * ELEMENT
 */

public interface Noeud {

	void accept(Visiteur v);
	
}
