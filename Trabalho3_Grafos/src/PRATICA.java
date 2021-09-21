
public class PRATICA {

	public static void main(String[] args) {
		Graph gh = new Graph(7);
		
		//Exemplo1(gh);
		//Exemplo2(gh);
		//Exemplo3(gh);
		Exemplo4(gh);
		gh.PrintGraph();
	
		System.out.println("Euleriano = " + gh.Euler());
		System.out.println("Não Euleriano = " + gh.NaoEuleriano());
		System.out.println("Semi Euleriano = " + gh.SemiEuleriano());
	}
	
	public static void Exemplo1(Graph gh) {	
		System.out.println("Grafo 1");
		gh.addEdge(1,2);
		gh.addEdge(1,3);
		gh.addEdge(1,4);
		gh.addEdge(1,5);
		
		gh.addEdge(2,4);
		gh.addEdge(2,6);
		gh.addEdge(2,7);
		
		gh.addEdge(3,4);
		gh.addEdge(3,5);
		gh.addEdge(3,7);
		
		gh.addEdge(4,6);
		gh.addEdge(5,6);
		gh.addEdge(5,7);
		gh.addEdge(6,7);
	}
	
	public static void Exemplo2(Graph gh) {		
		System.out.println("Grafo 2");
		gh.addEdge(1,2);
		gh.addEdge(1,3);
		gh.addEdge(1,4);
		gh.addEdge(1,5);
		
		gh.addEdge(2,4);
		gh.addEdge(2,6);
		gh.addEdge(2,7);
		
		gh.addEdge(3,4);
		gh.addEdge(3,5);
		gh.addEdge(3,7);
		
		gh.addEdge(4,6);
		gh.addEdge(5,7);
		gh.addEdge(6,7);
	}
	
	public static void Exemplo3(Graph gh) {		
		System.out.println("Grafo 3");
		gh.addEdge(1,2);
		gh.addEdge(1,3);
		gh.addEdge(1,4);
		gh.addEdge(1,5);
		
		gh.addEdge(2,4);
		gh.addEdge(2,6);
		
		gh.addEdge(3,5);
		gh.addEdge(4,6);

		gh.addEdge(5,7);
		gh.addEdge(6,7);
	}
	
	public static void Exemplo4(Graph gh) {
		System.out.println("Grafo 4");
		gh.addEdge(1,2);
		gh.addEdge(1,3);
		gh.addEdge(1,4);
		gh.addEdge(1,5);
		
		gh.addEdge(2,4);
		gh.addEdge(3,5);
		gh.addEdge(4,6);

		gh.addEdge(5,7);
		gh.addEdge(6,7);
	}
	
}