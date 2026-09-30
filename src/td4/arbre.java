package td4;

public class arbre {
	
	private static class neud<T>{
		
		private T data;
		private neud<T> first;
		private neud<T> next;
		
		public neud(T data) {
			this.data = data;
			this.first = null;
			this.next = null;
		}
		
		public void add(neud<T> child) {
			if(this.first == null) {
				this.first = child;
			}
			else {
				neud<T> current = this.first;
				while (current.next != null) {
	                current = current.next;
	            }
	            current.next = child;
			}
		}
		
		public T getData() {
			return data;
		}
		
		public neud<T> getFirst(){
			return first;
		}
		
		public neud<T> getNext(){
			return next;
		}
		
		public void printChildren(String indentation) {
			System.out.println(indentation + this.data);
			if (this.first != null) {
		        this.first.printChildren(indentation + "  ");
		    }
		    if (this.next != null) {
		        this.next.printChildren(indentation);
		    }
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			buildString(sb, " ");
			return sb.toString();
		}
		
		private void buildString(StringBuilder sb, String indentation) {
			System.out.println(indentation + this.data);
			if (this.first != null) {
		        this.first.printChildren(indentation + "  ");
		    }
		    if (this.next != null) {
		        this.next.printChildren(indentation);
		    }
		}
	}
	
	public static void main(String[] args) {
        neud<String> html = new neud<>("<html>");
        neud<String> head = new neud<>("<head>");
        neud<String> title = new neud<>("<title> Page test </title>");
        neud<String> head2 = new neud<>("</head>");
        neud<String> body = new neud<>("<body>");
        neud<String> h1 = new neud<>("<h1> Titre niveau 1 </h1>");
        neud<String> p = new neud<>("<p> Ceci est un paragraphe </p>");
        neud<String> body2 = new neud<>("</body>");
        neud<String> html2 = new neud<>("</html>");
        
        html.add(head);
        head.add(title);
        html.add(head2);
        html.add(body);
        body.add(h1);
        body.add(p);
        html.add(body2);
        html.add(html2);
        
        html.printChildren(" ");
        
        System.out.println("\n");
        String resultat = html.toString();
        System.out.println(resultat);
    }
	
	/* correction:
	 * 
	 * public class arbre<T>{
	 * 
	 * 	private Noeud<T> racine
	 * 
	 * 	public arbre(){
	 * 		racine = null;
	 * 	}
	 * 
	 * 	public arbre(T data){
	 * 		racine = new Noeud<T>(data);
	 * 	}
	 * 
	 * 	public void ajouteEtEcraseNg(T data){
	 * 		Noeud<T> n = new Noeud<T>(data);
	 * 		this.racine.ng = n;
	 * 	}
	 * 
	 * 	public void ajouteEtEcraseNd(T data){
	 * 		Noeud<T> n = new Noeud<T>(data);
	 * 		this.racine.nd = n;
	 * 	}
	 * 
	 *	public String toString(){
	 * 		return racin.toString();
	 * 	}
	 * 
	 * 	public String toStringPrefixe(){
	 * 		Stringbuilder sb = new Stringbuilder();
	 * 		//TODO A TERMINER
	 * 		sb.append(racine.toString)
	 * 		return sb.toString;
	 * 	}
	 * 
	 * 		private static class Noeud<T>{
	 * 			T data;
	 * 			Noeud<T> ng,nd;
	 * 
	 * 			public String prefixe(Noeud<T> n){
	 * 				if(n == null){
	 * 					return null;
	 * 				}
	 * 				String sg = prefixe(n.ng);
	 * 				String sd = prefixe(n.nd);
	 * 				return (n.data.toString() + " " + sg + " " + sd)
	 * 			}
	 * 
	 * 			public t getData{
	 * 				return T;
	 * 			}
	 * 
	 * 			public void setdata(T data){
	 * 				this.data = data;
	 * 			}
	 * 
	 * 			public Noeud<T> getNg(){
	 * 				return ng;
	 * 			}
	 * 
	 * 			public void setNg(Noeud<T> ng){
	 * 				this.ng = ng;
	 * 			}
	 * 
	 * 			public Noeud<T> getNd(){
	 * 				return nd;
	 * 			}
	 * 
	 * 			public void setNd(Noeud<T> nd){
	 * 				this.nd = nd;
	 * 			}
	 * 	
	 * 			public Noeud(T data){
	 * 				this.data = data;
	 * 				this.ng = null;
	 * 				this.nd = null;
	 * 			}
	 * 
	 * 			public String toString(){
	 * 				return "Noeud [data = " + data + "]";
	 * 			}
	 * 
	 * 			
	 *		}
	 *		
	 *		public static void main(String[] args){
	 *			arbre<String> arbretest = new arbre<String>
	 *		}
	 * }
	 */
}
