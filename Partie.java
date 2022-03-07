public class Partie {
	
	// METHODES
	public static void main(String[] arg) {
		System.out.println("Coucou");
		
		Graphe graphe = new Graphe(9, 13);
		System.out.println(graphe);
		graphe.ajoutCase();
		graphe.ajoutAretes();
		for (Case c : graphe.lesCases) {
			System.out.println(c);
		}
		for (Arete a : graphe.lesAretes) {
			System.out.println(a);
		}
		System.out.println(graphe.lesAretes.size());
		
	}
	
	public int WinState() {
		return 1;
	} 

}
