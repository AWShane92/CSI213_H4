package H4;

public class Main {

	public void transferList(){
		
	}
	
	public static void main(String[]args){
		
		Node a = new Node(0, "Alpha");
		Node b = new Node(1, "Bravo");
		Node c = new Node(2, "Charlie");
		Node d = new Node(3, "Delta");
		Node e = new Node(4, "Echo");
		Node f = new Node(5, "Foxtrot");
		
		
		Stack st = new Stack();
		Queue qu = new Queue();
		
		st.push(a);
		st.push(b);
		st.push(c);	
		qu.enqueue(d);
		qu.enqueue(e);
		qu.enqueue(f);
		
		st.print();
		System.out.println(" ");
		qu.print();
		System.out.println(" ");
		System.out.println(st.peek().toSring());
		System.out.println(qu.peek().toSring());
	}
}
