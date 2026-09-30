package td4;

import java.util.ArrayList;
import java.util.List;

public class arbre<T> {
	
	private static class arbres<T>{
		
		private T data;
		private List<arbres<T>> children;
		
		public arbres(T data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
		
		public void add(arbres<T> child) {
			this.children.add(child);
		}
		
		public T getData() {
			return data;
		}
		
		public List<arbres<T>> getChild(){
			return children;
		}
		
		public void printChildren(String indentation) {
			System.out.println(indentation + this.data);
			for(arbres<T> child : this.children) {
				child.printChildren(indentation + " ");
				}
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			buildString(sb, " ");
			return sb.toString();
		}
		
		private void buildString(StringBuilder sb, String indentation) {
			sb .append(indentation).append(this.data).append("\n");
			for(arbres<T> child : this.children) {
				child.buildString(sb,indentation + " ");
				}
		}
	}
	
	public static void main(String[] args) {
        arbres<String> html = new arbres<>("<html>");
        arbres<String> body = new arbres<>("<body>");
        arbres<String> head = new arbres<>("<head>");
        arbres<String> foot = new arbres<>("<foot>");
        
        html.add(head);
        html.add(body);
        head.add(foot);
        html.printChildren(" ");
        
        String resultat = html.toString();
        System.out.println("\n");
        System.out.println(resultat);
    }
}
