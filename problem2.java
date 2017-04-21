//2016110056 박승원

interface Collection 
{
	void add(Object obj);
	void delete();
	void find(Object obj);
	int currentCount();
}

class Link
{
	Object data;
	Link next;

	Link(Object d, Link n) {
		data = d;
		next = n;
	}
}

class Queue implements Collection 
{
	private Link head = null;
	private Link tail = null;
	private Link ptr = null;
	private int count = 0;

	public void add(Object obj) {
		if(count == 0) {
			head = new Link(obj, null);
			tail = head;
		} else {
			tail.next = new Link(obj, null);
			tail = tail.next;
		}
		tail.data = obj;
		count++;
		System.out.println(obj + " is added.");
	}

	public void delete() {
		System.out.println(head.data + " is deleted.");
		head = head.next;
		if(head == tail) tail = head;
		count--;
	}

	public void find(Object obj) {
		int i = 0;
		Link l;
		for(l = head; l != null; l = l.next) {
			i++;
			if(l.data == obj) {
				System.out.println(obj + " is " + i + "th in queue");
				break;
			}
		}
		if(l == null) System.out.println(obj + " is not in the queue."); 
	}

	public int currentCount() {
		System.out.println(count + " objects are found.");
		return count;
	}
}

public class problem2 
{
	static public void main(String[] args) {
		System.out.println("Queue Simulator start");
		
		Queue q = new Queue();
		Integer a = new Integer(1);

		q.add(new Integer(1));
		q.add(a);
		q.add(new Integer(5));

		q.currentCount();
		q.find(new Integer(5));
		q.find(a);

		q.delete();
		q.delete();
		q.delete();

		q.currentCount();

		System.out.println("Queue Simulator end.");
	}
}
