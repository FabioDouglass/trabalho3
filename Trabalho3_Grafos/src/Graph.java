import java.util.ArrayList;
import java.util.Hashtable;

public class Graph {

	private int N;
	private Hashtable<Integer, ArrayList<Integer>> vertex;
		
	public Graph(int N) {
		this.N=N;
		vertex = new Hashtable<>(N+1);
		
		for(int x = 1; x <= N; x++) {
			vertex.put(x, new ArrayList<Integer>());
		}}
	
	
	public void addEdge(Integer source, Integer target) {
		vertex.get(source).add(target);
		vertex.get(target).add(source);
	}
	
	
	public boolean Euler() {
		for(int x = 1; x <= N; x++) {
			if(vertex.get(x).size() % 2 == 1) {
				return false;
			}}
		
		return true;
	}
	
	
	public boolean NaoEuleriano() {
		int cont = 0;
		
		for(int x = 1; x <= N; x++) {
			if(vertex.get(x).size() % 2 == 1) {
				cont ++;
			}}
		
		return (cont >= 2);
	}
	
	
	public boolean SemiEuleriano() {
		int cont = 0;
		
		for(int x = 1; x <= N; x++) {
			if(vertex.get(x).size() % 2 == 1) {
				cont ++;
			}}
		
		return (cont == 2);
	}
	
	
	public void PrintGraph() {
		for(int x = 1; x <= N; x++) {
			System.out.println(x + " -> " + vertex.get(x));
		}System.out.println();
	}
	
}