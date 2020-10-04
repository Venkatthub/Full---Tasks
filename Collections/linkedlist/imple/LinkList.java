package linkedlist.imple;

public class LinkList<T> {

	/*
	 * Linked list with all methods
	 * insert(T data)
	 * set(int index, T num)
	 * size()
	 * showFirst()
	 * showLast()
	 * show()
	 * removeFirst()
	 * removeLast()
	 * removeElement()
	 */
	
	private Node<T> head;

	// Method to add element
	public void insert(T data) {
		Node<T> node = new Node<>();
		node.data = data;
		node.next = null;

		if (head == null) {

			head = node;

		} else {

			Node<T> n = head;
			while (n.next != null) {

				n = n.next;

			}
			n.next = node;
		}
	}

	// Method to add element in a particular index
	public void set(int index, T num) {

		Node<T> node = head;
		if (index < size()) {
			Node<T> no = new Node<>();
			for (int i = 1; i < index; i++) {
				node = node.next;
			}
			no.next = node.next;
			node.next = no;
			no.data = num;

		}
	}

	// Method to return size of the list
	public int size() {

		Node<T> n = head;
		int size = 0;
		while (n.next != null) {

			size++;
			n = n.next;
		}

		return size + 1;
	}

	// Method to display first element in the list
	public T showFirst() {

		Node<T> n = head;
		return n.data;
	}

	// Method to display last element in the list
	public T showLast() {

		Node<T> n = head;
		while (n.next != null) {
			n = n.next;
		}

		return n.data;

	}

	// Method to return the list
	public void show() {

		Node<T> n = head;

		while (n.next != null) {

			System.out.print(n.data + ", ");
			n = n.next;

		}
		System.out.print(n.data + "\n");

	}

	// Method to remove first element in the list
	public void removeFirst() {

		Node<T> n = head;
		head = n.next;
	}

	// Method to remove last element in the list
	public void removeLast() {

		Node<T> n = head;

		for (int i = 1; i < size() - 1; i++) {
			n = n.next;
		}
		n.next = null;
	}

	// Method to remove specified element in the list
	public void removeElement(T d) {

		Node<T> node = head;
		while (node.next.data != d) {

			node = node.next;
		}
		Node<T> newNode = node.next.next;
		node.next = newNode;
	}
}
